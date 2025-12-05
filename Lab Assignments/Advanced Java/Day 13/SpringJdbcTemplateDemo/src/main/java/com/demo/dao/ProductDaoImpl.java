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
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(MyProduct p) {
		int n=jdbcTemplate.update("insert into myproduct values(?,?,?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid()});
	
	    return n >0;
	}

	@Override
	public List<MyProduct> findAllProducts() {
		//second parameter is a implementation of n mapRow(ResultSet rs, int n) function 
		//of RowMapper Interface
		List<MyProduct> plist=jdbcTemplate.query("select * from myproduct", (rs,n)->{
			MyProduct p=new MyProduct();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQty(rs.getInt(4));
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
	public List<MyProduct> findByCatId(int cid) {
		List<MyProduct> plist=jdbcTemplate.query("select * from myproduct where cid=?", 
				new Object[]{cid},(rs,numrows)->{
					MyProduct p=new MyProduct();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getDouble(3));
					p.setQty(rs.getInt(4));
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
	public MyProduct findByPid(int pid) {
		try {
		MyProduct p=jdbcTemplate.queryForObject("select * from myproduct where pid=?",
				new Object[] {pid},BeanPropertyRowMapper.newInstance(MyProduct.class)
				);
		return p;
		}catch(EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public boolean removeById(int pid) {
		int n=jdbcTemplate.update("delete from myproduct where pid=?",new Object[] {
				pid});
		return n>0;
	}

	@Override
	public boolean updateById(int pid, int qty, double pr) {
		int n=jdbcTemplate.update("update myproduct set qty=?,price=? where pid=?",
				new Object[] {qty,pr,pid});
		return n>0;
	}

	@Override
	public List<MyProduct> arrangeByPrice() {
		List<MyProduct> plist=jdbcTemplate.query("select * from myproduct order by price", (rs,numrows)->{
		  MyProduct p=new MyProduct();
		  p.setPid(rs.getInt(1));
		  p.setPname(rs.getString(2));
		  p.setPrice(rs.getDouble(3));
		  p.setQty(rs.getInt(4));
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

}
