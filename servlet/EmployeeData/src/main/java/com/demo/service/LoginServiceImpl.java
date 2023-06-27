package com.demo.service;

import com.demo.Dao.LoginDao;
import com.demo.Dao.LoginDaoImpl;
import com.demo.beans.LoginC;

public class LoginServiceImpl implements LoginService {
	
	private static LoginDao edao;

	public LoginServiceImpl() {
		
		edao = new LoginDaoImpl();
	}
	@Override
	public LoginC checkUser(LoginC user) {
		return edao.userValidate(user);
		
	}
	
	
	
	

}
