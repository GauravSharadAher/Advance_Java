package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
		@Autowired
		private ProductDao productdao;

		@Override
		public List<Product> displayAll() {
		return productdao.displayAllProd();
		}

		@Override
		public void add(Product p) {
		 productdao.addprod(p);
			
		}

		@Override
		public Product getById(int pid) {
			return productdao.findById(pid);
		}

		@Override
		public void modify(int pid, String pname, int qty, float price) {
			productdao.modify(pid,pname,qty,price);
			
		}

		@Override
		public void delById(int pid) {
			productdao.del(pid);
			
		}
		
}
