package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> findEmp(int dno);

	void close();

}
