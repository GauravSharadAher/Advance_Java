package com.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Myuser;

import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl  implements LoginService{
	@Autowired
	private LoginDao logindao;
	

	@Override
	public Myuser validate(String name, String password) {
		return logindao.validateU(name,password);
	}



	

}
