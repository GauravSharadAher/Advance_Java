package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Myuser;
import com.demo.beans.Product;


public class Test {
	public static void main(String[] args) {
		//Ware_house w= new Ware_house(10,"pune","asdasd");//transient object
		//Product p = new Product(1,250,w);// transient object
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		//Session sess= sf.openSession();
		//Transaction tf= sess.beginTransaction();
		//sess.save(p);
		//tf.commit();// persistant state/object
		//sess.close();
		//sf.close();
		
		
		Session sess =sf.openSession();
		Transaction tf = sess.beginTransaction();
		System.out.println("before");
		Product p2=sess.load(Product.class, 1);
		System.out.println("after");
		System.out.println(p2.getPid());
		System.out.println(p2.getPrice());
		System.out.println(p2.getLoc().getAddrs());
		tf.commit();
		System.out.println(p2);
		sess.close();
		sf.close();
		
		
		
		
		
	}
}
