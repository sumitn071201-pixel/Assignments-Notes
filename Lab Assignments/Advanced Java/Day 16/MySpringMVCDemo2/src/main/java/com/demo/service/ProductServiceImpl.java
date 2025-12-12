package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyProduct;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired   
	ProductDao pdao;

	public List<MyProduct> getAllProducts() {
		return pdao.findAllProducts();
	}

	public boolean addproduct(MyProduct p) {
		return pdao.save(p);
		
	}

	
	public MyProduct getById(int pid) {
		return pdao.findById(pid);
	}

	public boolean updateproduct(MyProduct p) {
		return pdao.modifyProduct(p);
	}


	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}
}
