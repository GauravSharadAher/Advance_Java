package com.demo.SpringBoot_Crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.SpringBoot_Crud.beans.Product;
@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

	
	@Query(value="select * from product_s where price between :lpr and :hpr",nativeQuery = true)
	List<Product> pricefilter(int lpr, int hpr);
	
	

}
