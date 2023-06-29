package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Myuser;


public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();//cfg.xml 
		SessionFactory sf = cfg.buildSessionFactory();
	//	Session sess= sf.openSession();
	//	Transaction tf = sess.beginTransaction();
	//	Address a1 = new Address(11,"Pune","Kasbhapeth",null);
	//	Address a2 = new Address(12,"PimpriChinchwad","Rahatni",null);
	//	Set<Address> aset = new HashSet<>();
	//	aset.add(a1);
	//	aset.add(a2);
	//	Myuser u = new Myuser(1,"Deepak",aset);
	//	a1.setU1(u);
	//	a2.setU1(u);
	//	sess.save(a1);
	//	sess.save(a2);
	//	sess.save(u);
	//	tf.commit();
	//	sess.close();
		//sf.close();
		
		
		
		
		// fetching data
		Session sess = sf .openSession();
		Transaction tf = sess.beginTransaction();
		//Myuser u2= sess.get(Myuser.class, 1);
		//System.out.println(u2);
		
		Address a = sess.get(Address.class, 11);
		System.out.println(a);
		System.out.println(a.getU1());
		tf.commit();
		sf.close();
		
	}

}
