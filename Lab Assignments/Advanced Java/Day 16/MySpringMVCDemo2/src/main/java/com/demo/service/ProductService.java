package com.demo.service;

import java.util.List;

import com.demo.beans.MyProduct;

public interface ProductService {

	List<MyProduct> getAllProducts();

	boolean addproduct(MyProduct p);

	MyProduct getById(int pid);

	boolean updateproduct(MyProduct p);

	boolean deleteById(int pid);


  
}
