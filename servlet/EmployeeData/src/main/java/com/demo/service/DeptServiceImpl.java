package com.demo.service;

import java.util.List;

import com.demo.Dao.DeptDao;
import com.demo.Dao.DeptDaoImpl;
import com.demo.beans.Dept;

public class DeptServiceImpl implements DeptService {
	private static DeptDao ddao;
	
		public DeptServiceImpl() {
			ddao=new DeptDaoImpl();
		}

	@Override
	public List<Dept> show() {
		return ddao.displayAll();
		
	}
	
	

}
