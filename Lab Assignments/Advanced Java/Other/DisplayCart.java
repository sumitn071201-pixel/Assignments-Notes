package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.entity.Product;
import com.demo.entity.User;

@WebServlet("/displayCart")
public class DisplayCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session =req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			HashMap<Integer , Product> map = (HashMap<Integer, Product>) session.getAttribute("cart");
			
			double total=0;
			if(map==null) {
				out.println("Cart is Empty");
			}else {
				out.println("<form action='OrderPaced.html'>");
				for(Map.Entry<Integer , Product> m : map.entrySet()) {
					Product p = m.getValue();
					double tprice = p.getPrice()*p.getQty();
					out.println(p.getId() + "<br>");
					out.println(p.getName() + "<br>");
					out.println(p.getQty() + "<br>");
					out.println(p.getPrice() + "<br>");
					total+=tprice;
					out.println("total product price="+ tprice  + "<br>");
					out.println( "<br>--------------------------------------------<br>");
				}
				out.println( "<br>--------------------------------------------<br>");
				out.println( "total cart price:"+total);
				out.println( "<br>--------------------------------------------<br>");
				
				out.println("<button type= 'submit'>");
				out.println("</form>");
				
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
