package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {


	void save(Employee e);

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean changeById(int id, double sal);

	List<Employee> sort();

	void closeConnection();

}
