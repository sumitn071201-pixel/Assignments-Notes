package com.example.SpringBootRestWebservice.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringBootRestWebservice.beans.MyProduct;

@Repository
public interface ProductDao extends JpaRepository<MyProduct,Integer>{
	@Query(value="select * from myproduct where price between :lprice and :hprice",nativeQuery = true)
	//@Query(value="select p from Product p where price between :lpr and :hpr") 
	List<MyProduct> findByPrice(double lprice, double hprice);
	
	
}
