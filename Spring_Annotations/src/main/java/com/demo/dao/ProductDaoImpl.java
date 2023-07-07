package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Product p) {
		int n=jdbcTemplate.update("insert into product_s values(?,?,?,?)",new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
	}

	@Override
	public List<Product> displayAll() {
		List<Product> plist=jdbcTemplate.query("select * from product_s",BeanPropertyRowMapper.newInstance(Product.class));
		return plist;
	}

	@Override
	public boolean delById(int id) {
		int n= jdbcTemplate.update("delete from product_s where pid=?",new Object[] {id});
		return n>0;
	}

	@Override
	public boolean modifyById(int id,int qty,float price) {
		int n=jdbcTemplate.update("update product_s set qty=? ,price=? where pid=?",new Object[] {qty,price,id});
		return n>0;
	}

	@Override
	public Product displayById(int id) {
		Product p=jdbcTemplate.queryForObject("select * from product_s where pid=?", new Object[] {id},BeanPropertyRowMapper.newInstance(Product.class));
		return p;
	}

	@Override
	public List<Product> sort() {
		List<Product> plist=jdbcTemplate.query("SELECT * FROM PRODUCT_S ORDER BY PRICE ASC", BeanPropertyRowMapper.newInstance(Product.class));
		return plist;
	}
	
	
	
}
