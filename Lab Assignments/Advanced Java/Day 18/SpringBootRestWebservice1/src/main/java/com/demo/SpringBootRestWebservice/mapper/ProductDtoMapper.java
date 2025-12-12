package com.demo.SpringBootRestWebservice.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootRestWebservice.beans.MyProduct;
import com.demo.SpringBootRestWebservice.dto.ProductDto;



public class ProductDtoMapper {

	public static MyProduct mapToProduct(ProductDto p) {
		
		return new MyProduct(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}
	
	public static ProductDto mapToProductDto(MyProduct prod) {
		if(prod.getMfgdate()==null) {
			return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		}
		return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
	}

}
