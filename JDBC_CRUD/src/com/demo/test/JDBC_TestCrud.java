package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class JDBC_TestCrud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es= new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("1. add new employee\n2. delete emplyee \n 3. modify employee");
			System.out.println("4. display all\n5. display by id \n 6. display in sorted order\n 7. exit\n choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.addEmp();
				break;
			case 2:
				System.out.println("Enter id :");
				int id=sc.nextInt();
				boolean status =es.deleteEmp(id);
				if(status) {
					System.out.println("Employee Deleted Sucessfully!");
				}else {
					System.out.println("Employee Not Found");
				}
				break;
			case 3:
				System.out.println("Enter id: ");
				id=sc.nextInt();
				System.out.println("Enter new Salary :");
				double sal= sc.nextDouble();
				status=es.modifyById(id,sal);
				if(status) {
					System.out.println("Salary Updated");
				}else {
					System.out.println("Employee Not Found");
				}
				break;
			case 4:
				List<Employee> lst= es.displayAll();
				lst.forEach(System.out::println);
				break;
			case 5:
				System.out.println("Enter Id:");
				 id=sc.nextInt();
				Employee e= es.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Employee Not Found");
					System.out.println();
				}
				break;
			case 6:
				lst=es.sortByName();
				if(es!=null) {
					lst.forEach(System.out::println);
				}
				break;
			case 7:
				es.closeMyConnection();
				System.out.println("Thank you for visiting ");
				break;
				
			}
		}while(choice!=7);
		
	}

}
