package com.demo.SpringBoot_Crud.service;

import java.util.List;

import javax.validation.Valid;

import com.demo.SpringBoot_Crud.beans.Product;

public interface ProductService {

	List<Product> getAllProduct();

	void addProduct(Product p);

	void delete(int pid);

	Product findById(int pid);

	void modifyProduct( Product p);

	List<Product> filter(int lpr, int hpr);

}
