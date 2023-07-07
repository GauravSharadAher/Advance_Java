package com.demo.SpringBoot_Crud.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBoot_Crud.beans.Product;
import com.demo.SpringBoot_Crud.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

		@Autowired
		private ProductDao productdao;
		
		
	@Override
	public List<Product> getAllProduct() {
		List<Product> plist=productdao.findAll();
		return plist;
	}


	@Override
	public void addProduct(Product p) {
		productdao.save(p);
	}


	@Override
	public void delete(int pid) {
		productdao.deleteById(pid);
		
	}


	@Override
	public Product findById(int pid) {
		Optional<Product> p= productdao.findById(pid);
		if(p.isPresent()) {
			return p.get();
		}
			return null;
}


	@Override
	public void modifyProduct(@Valid Product p) {
		Optional<Product> pr = productdao.findById(p.getPid());
		if(pr.isPresent()) {
			Product p1 = pr.get();
			p1.setPname(p.getPname());
			p1.setQty(p.getQty());
			p1.setPrice(p.getPrice());
			productdao.save(p);
		}
		
	}


	@Override
	public List<Product> filter(int lpr, int hpr) {
		List<Product> plist=productdao.pricefilter(lpr,hpr);
		return plist;
	}

}
