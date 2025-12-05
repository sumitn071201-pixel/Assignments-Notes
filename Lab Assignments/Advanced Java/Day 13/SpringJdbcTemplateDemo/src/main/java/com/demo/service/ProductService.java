package com.demo.service;

import java.util.List;

import com.demo.beans.MyProduct;

public interface ProductService {

	boolean addnewProduct();

	List<MyProduct> getAllProduct();

	List<MyProduct> getByCatId(int cid);

	MyProduct getByPid(int pid);

	boolean deleteByPid(int pid);

	boolean modifyById(int pid, int qty, double pr);

	List<MyProduct> sorteByPrice();

}
