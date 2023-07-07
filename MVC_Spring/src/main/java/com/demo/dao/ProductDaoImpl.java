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

	@Override
	public List<Product> displayAllProd() {
		return jdbcTemplate.query("select * from product_s", BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public int addprod(Product p) {
		int n=jdbcTemplate.update("insert  into product_s values(?,?,?,?)",new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
		return n;
	}

	@Override
	public Product findById(int pid) {
		Product p =jdbcTemplate.queryForObject("SELECT * FROM PRODUCT_S WHERE PID=?", new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		return p;
	}

	@Override
	public void modify(int pid, String pname, int qty, float price) {
		jdbcTemplate.update("update product_s set pname=?,qty=?,price=? where pid=?",new Object[] {pname,qty,price,pid});
	}

	@Override
	public void del(int pid) {
		jdbcTemplate.update("delete from product_s where pid=?",new Object[] {pid});
	}
	
	
	
}
