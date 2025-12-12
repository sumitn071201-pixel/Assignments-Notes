package com.demo.dao;

import java.util.List;

import com.demo.beans.MyProduct;

public interface ProductDao {

	List<MyProduct> findAllProducts();

	boolean save(MyProduct p);

	MyProduct findById(int pid);

	boolean modifyProduct(MyProduct p);

	boolean removeById(int pid);

}
