package com.demo.dao;

import java.util.List;

import com.demo.beans.MyProduct;

public interface ProductDao {

	boolean save(MyProduct p);

	List<MyProduct> findAllProducts();

	List<MyProduct> findByCatId(int cid);

	MyProduct findByPid(int pid);

	boolean removeById(int pid);

	boolean updateById(int pid, int qty, double pr);

	List<MyProduct> arrangeByPrice();

}
