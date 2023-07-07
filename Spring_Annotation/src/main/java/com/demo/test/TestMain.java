package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Myuser;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Myuser u1=(Myuser)ctx.getBean("myuser");
		 
		System.out.println(u1);
		((ClassPathXmlApplicationContext)ctx).close();

	}
}
