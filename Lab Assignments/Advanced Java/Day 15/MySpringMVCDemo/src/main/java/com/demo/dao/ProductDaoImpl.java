package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyProduct;

@Repository
public class ProductDaoImpl implements ProductDao{
	  @Autowired 
      JdbcTemplate jdbcTemplate;

	public List<MyProduct> findAllProducts() {
		List<MyProduct> plist=jdbcTemplate.query("select * from myproduct", (rs,numrows)->{
			MyProduct p=new MyProduct();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(4));
			p.setPrice(rs.getDouble(3));
			if(rs.getDate(5)==null) {
				p.setMfgdate(null);
			}else {
			    p.setMfgdate(rs.getDate(5).toLocalDate());
			}
			p.setCid(rs.getInt(6));
			
			return p;
		});
		return plist;	
	}

	@Override
	public boolean save(MyProduct p) {
		int n=jdbcTemplate.update("insert into myproduct values(?,?,?,?,?,?)",new Object[] {
				p.getPid(),p.getPname(),p.getPrice(),p.getQty(),p.getMfgdate(),p.getCid()
		});
		return n>0;
	}

	@Override
	public MyProduct findById(int pid) {
		try {
		MyProduct p=jdbcTemplate.queryForObject("select * from myproduct where pid=?",
				new Object[] {pid},BeanPropertyRowMapper.newInstance(MyProduct.class));
		return p;
		}catch(EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}		
	}

	@Override
	public boolean modifyProduct(MyProduct p) {
		int n=jdbcTemplate.update("update myproduct set pname=?,qty=?,price=?,cid=? where pid=?",
				new Object[] {
						p.getPname(),p.getQty(),p.getPrice(),p.getCid(),p.getPid()
				});
		return n>0;
	}

	@Override
	public boolean removeById(int pid) {
		int n=jdbcTemplate.update("delete from  myproduct where pid=?",new Object[] {pid});
		return n>0;
	}
}
