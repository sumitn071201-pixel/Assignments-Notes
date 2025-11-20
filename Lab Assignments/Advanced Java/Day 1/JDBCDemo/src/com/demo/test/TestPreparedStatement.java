package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement {
	public static void main(String[] args) {
		 Connection conn=null;
			 try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url ="jdbc:mysql://192.168.10.117/dac88?useSSL=false";
				conn=DriverManager.getConnection(url,"dac88","welcome");
				if(conn!=null) {
					System.out.println("connection done");
				}else {
					System.out.println("connection not done");
				}
				PreparedStatement pst=conn.prepareStatement("select * from myproduct");
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					
					System.out.println("Pid "+rs.getInt("pid"));
					System.out.println("Pname "+rs.getString("pname"));
					System.out.println("Qty "+rs.getInt("qty"));
					System.out.println("Price "+rs.getDouble("price"));
					System.out.println("Mfgdate "+rs.getDate("mfgdate"));
	
				}
				
				PreparedStatement pst1=conn.prepareStatement("insert into myproduct values (?,?,?,?,?)");
				int pid=124;
				String pname="yyyyy";
				int qty=45;
				double price=456.78;
				LocalDate ldt=LocalDate.now();
				String sqlDate = ldt.toString();
				pst1.setInt(1, pid);
				pst1.setString(2,pname);
				pst1.setInt(3, qty);
				pst1.setDouble(4, price);
				pst1.setDate(5, java.sql.Date.valueOf(ldt));
				
				int n=pst1.executeUpdate();
				if(n>0) {
					System.out.println("insertion done");
				}else {
					System.out.println("error");
				}
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}finally{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			

		}


}
