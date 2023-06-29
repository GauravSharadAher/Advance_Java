package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;



public class Test {
public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		/*Session sess = sf.openSession();
		Transaction tf = sess.beginTransaction();
		Employee e1 = new Employee(1,"Deepak",null);
		Employee e2 = new Employee(2,"Gaurav",null);
		Employee e3 = new Employee(3,"Mahajan",null);
		Set<Employee> eset = new HashSet<>();
		eset.add(e1);
		eset.add(e2);
		Set<Employee> eset2 = new HashSet<>();
		eset2.add(e3);
		eset2.add(e1);
		Project p = new Project(10,"Java Client",eset);
		Project p2 = new Project(11,"C++ project",eset2);
		Project p3 = new Project(12,"Python client",eset);
		Set<Project> pset = new HashSet<>();
		pset.add(p);
		pset.add(p2);
		Set<Project> pset2 = new HashSet<>();
		pset2.add(p3);
		pset2.add(p2);
		sess.save(e1);
		sess.save(e2);
		sess.save(e3);
		sess.save(p);
		sess.save(p2);
		sess.save(p3);
		tf.commit();
		sess.close();
		sf.close();*/
		
		
		
		Session sess= sf.openSession();
		Transaction tf = sess.beginTransaction();
		Employee p = sess.get(Employee.class,3);
		System.out.println(p.getPset());
		tf.commit();
		System.out.println(p);
		sess.close();
		sf.close();
		
		
		
		
		
	}
}
