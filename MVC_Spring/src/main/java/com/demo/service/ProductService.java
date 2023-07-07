package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> displayAll();

	void add(Product p);

	Product getById(int pid);

	void modify(int pid, String pname, int qty, float price);

	void delById(int pid);

}
