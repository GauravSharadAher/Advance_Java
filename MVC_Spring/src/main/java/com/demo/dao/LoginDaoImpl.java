package com.demo.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Myuser;


@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Myuser validateU(String name, String password) {
		try {
			return jdbcTemplate.queryForObject("select * from user where name=? and password=?", new Object[] {name,password}, BeanPropertyRowMapper.newInstance(Myuser.class));
		}catch(Exception e) {
			return null;
		}
	}

	
}
