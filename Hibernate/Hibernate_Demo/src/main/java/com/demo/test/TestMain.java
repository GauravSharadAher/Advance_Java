package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Myuser;


public class TestMain {
	public static void main(String[] args) {
		//Myuser user1 = new Myuser("Gaurav","abc@gmail.com");// transient object/phase
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		//Session sess= sf.openSession();
		//Transaction tf = sess.beginTransaction();
	//	sess.save(user1);
		//tf.commit(); // here the transient object become persistent object/phase
		//sess.close();
		
		Session sess2= sf.openSession();
		Transaction tf1 = sess2.beginTransaction();
		Myuser u2= sess2.get(Myuser.class, 1);
		tf1.commit();
		System.out.println(u2);
		sess2.close();
		sf.close();
		
		
		
		
	}

}
