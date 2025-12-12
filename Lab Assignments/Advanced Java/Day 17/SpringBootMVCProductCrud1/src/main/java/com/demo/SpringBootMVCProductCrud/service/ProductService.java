package com.demo.SpringBootMVCProductCrud.service;

import java.util.List;

import com.demo.SpringBootMVCProductCrud.beans.MyProduct;

public interface ProductService {

	List<MyProduct> findAllProducts();

	void addnewProduct(MyProduct myProduct);

	MyProduct getById(int pid);

	void updateProduct(MyProduct prod);

	void deleteProduct(int pid);

}
