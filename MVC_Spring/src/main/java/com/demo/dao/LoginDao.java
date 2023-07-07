package com.demo.dao;

import java.util.List;

import com.demo.beans.Myuser;
import com.demo.beans.Product;

public interface LoginDao {

	Myuser validateU(String name, String password);

	

}
