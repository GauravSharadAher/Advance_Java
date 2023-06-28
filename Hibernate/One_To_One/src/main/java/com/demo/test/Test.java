package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class Test {
	public static void main(String[] args) {
			//	Address a = new Address(21,"pune");
			//	Student s = new Student(10,"Deepak",a);// transient object
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
			//	Session sess= sf.openSession();
				//Transaction tf= sess.beginTransaction();
			//	sess.save(a);
			//	sess.save(s);
				//tf.commit();// persistant state/object
				//sess.close();
				//sf.close();
				
				
				Session sess2 =sf.openSession();
				Transaction tf1 = sess2.beginTransaction();
				System.out.println("before");
				Student p2=sess2.load(Student.class, 1);
				//Student p2=sess2.get(Student.class, 1);
				System.out.println("after");
				System.out.println(p2.getSid());
				System.out.println(p2.getSname());
				System.out.println(p2.getAddr().getCity());
				tf1.commit();
				System.out.println(p2);
				sess2.close();
				sf.close();
	}

}
