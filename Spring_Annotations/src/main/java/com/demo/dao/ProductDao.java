package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void save(Product p);

	List<Product> displayAll();

	boolean delById(int id);

	boolean modifyById(int id,int qty,float price);

	Product displayById(int id);

	List<Product> sort();

}
