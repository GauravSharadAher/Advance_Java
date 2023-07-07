package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> displayAllProd();

	int addprod(Product p);

	Product findById(int pid);

	void modify(int pid, String pname, int qty, float price);

	void del(int pid);

}
