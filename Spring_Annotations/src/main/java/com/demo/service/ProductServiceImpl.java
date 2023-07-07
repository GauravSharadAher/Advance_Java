package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productdao;

	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id");
		int pid=sc.nextInt();
		System.out.println("Enter Product name:");
		String pname=sc.next();
		System.out.println("Enter Quantity");
		int qty =sc.nextInt();
		System.out.println("Enter price");
		float price = sc.nextFloat();
		Product p= new Product(pid,pname,qty,price);
		productdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		return productdao.displayAll();
	}

	@Override
	public boolean deleteById(int id) {
		return productdao.delById(id);
	}

	@Override
	public boolean modifyById(int id,int qty,float price) {
		return productdao.modifyById(id,qty,price);
	}

	@Override
	public Product displayById(int id) {
		return productdao.displayById(id);
	}

	@Override
	public List<Product> sortByprice() {
		return productdao.sort();
	}
	
	
}
