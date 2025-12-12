package com.demo.SpringBootMVCProductCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMVCProductCrud.beans.MyProduct;
import com.demo.SpringBootMVCProductCrud.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
	ProductDao pdao;

@Override
public List<MyProduct> findAllProducts() {
	return pdao.findAll();
}

@Override
public void addnewProduct(MyProduct myProduct) {
	pdao.save(myProduct);
	
}

@Override
public MyProduct getById(int pid) {
	Optional<MyProduct> op=pdao.findById(pid);
	if(op.isPresent()) {
		return op.get();
	}
	return null;
}

@Override
public void updateProduct(MyProduct prod) {
	Optional<MyProduct> op=pdao.findById(prod.getPid());
	if(op.isPresent()) {
		MyProduct p=op.get();
		p.setPname(prod.getPname());
		p.setQty(prod.getQty());
		p.setPrice(prod.getPrice());
		p.setCid(prod.getCid());
		//update the product
		pdao.save(p);
		
	}
	
}

@Override
public void deleteProduct(int pid) {
	Optional<MyProduct> op=pdao.findById(pid);
	if(op.isPresent()) {
		MyProduct p=op.get();
		pdao.delete(p);
	}
	
}
}
