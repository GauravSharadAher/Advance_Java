package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.mysql.cj.Session;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping("/showproduct")
	public ModelAndView displayProd() {
		List<Product> plist=productservice.displayAll();
		return new ModelAndView("displayproduct","plist",plist);
	}
	@GetMapping("/addnewproduct")
	public String addproductform() {
		return "addproductform";
	}
	
	@PostMapping("/addproduct")
	public ModelAndView addproduct(HttpSession session,@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam float price){
	Product p = new Product(pid,pname,qty,price);
		productservice.add(p);
		return new ModelAndView("redirect:/product/showproduct");
	}
	
	@GetMapping("/edit")
	public String updateprod() {
		return "edit";
	}
	
	@GetMapping("/edit/{pid}")
	public ModelAndView editproduct(@PathVariable("pid")int pid) {
		Product p= productservice.getById(pid);
		return new ModelAndView("edit","pr",p);
	}
	
	@PostMapping("/updateproduct")
	public ModelAndView updateProduct(HttpSession session,@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam float price){
		productservice.modify(pid,pname,qty,price);
		return new ModelAndView("redirect:/product/showproduct");
	}
	
	@GetMapping("/delete/{pid}")
	public ModelAndView delproduct(@PathVariable("pid")int pid) {
		productservice.delById(pid);
		return new ModelAndView("redirect:/product/showproduct");
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "loginpage";
	}
	
	
}
