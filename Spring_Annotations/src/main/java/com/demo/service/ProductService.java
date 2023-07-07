package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addProduct();

	List<Product> displayAll();

	boolean deleteById(int id);

	boolean modifyById(int id,int qty,float price);

	Product displayById(int id);

	List<Product> sortByprice();

}
