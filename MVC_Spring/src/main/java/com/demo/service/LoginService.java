package com.demo.service;



import com.demo.beans.Myuser;


public interface LoginService {

	Myuser validate(String name, String password);

	

}
