package com.demo.ProductRestWebservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.ProductRestWebservice.beans.MyProduct;

@Repository
public interface ProductDao extends JpaRepository<MyProduct,Integer>{

	  @Query(value="select * from myproduct where cid=:cid",nativeQuery=true)
	  public List<MyProduct> findAllByCid(int cid);
}
