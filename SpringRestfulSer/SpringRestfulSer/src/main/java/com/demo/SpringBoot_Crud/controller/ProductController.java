package com.demo.SpringBoot_Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBoot_Crud.beans.Product;
import com.demo.SpringBoot_Crud.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> displayAll() {
		List<Product> plist=productservice.getAllProduct();
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/product/{pid}")
	public ResponseEntity<Product> searchById(@PathVariable int pid){
		Product p = productservice.findById(pid);
		if(p!=null) {
			return ResponseEntity.ok(p);
			}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}
	
	@PostMapping("/product/{pid}")
	public ResponseEntity<String> addProduct(@RequestBody Product p){
		productservice.addProduct(p);
		return ResponseEntity.ok("added successfully");
	}
	
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid){
		productservice.delete(pid);
		return ResponseEntity.ok("deleted sucessesfully");
	}
	
	@PutMapping("/product/{pid}")
	public ResponseEntity<String> insertProduct(@RequestBody Product p){
		productservice.modifyProduct(p);
		return ResponseEntity.ok("Updated Sucessfully");
	}
	@GetMapping("/product/price/lpr/hpr")
	public ResponseEntity<List<Product>> getByPrice(@PathVariable int lpt,@PathVariable int hpr){
		List<Product> plist=productservice.filter(lpt, hpr);
		return ResponseEntity.ok(plist);
	}
	}
	

	
