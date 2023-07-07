package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainLocale {
	public static void main(String[] args) {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("springconfig.xml");
		
		MessageSource ms = (MessageSource) ctx.getBean("messageSource");
		String a=null,b=null,c=null,d=null;
		Locale locale=null;
		int choice=0;
		do {
			System.out.println("1.Marathi\n2.English\n3.UK\n4.Exit\n Choice :");
			Scanner sc = new Scanner(System.in);
			 choice=sc.nextInt();
		switch(choice){
		case 1:
			locale=new Locale("my","marathi");
			System.out.println("language :" +locale.getCountry() +"---"+locale.getLanguage());
			a=ms.getMessage("msg.pay", null,locale);
			b=ms.getMessage("msg.welcome", new Object[] {"Gaurav"},locale);
			c=ms.getMessage("msg.data",null,locale);
			d=ms.getMessage("msg.currency", null,locale);
			System.out.println("Pay : "+a);
			System.out.println("Welcome: "+b);
			
			System.out.println("Enter amount");
					int amt=sc.nextInt();
			System.out.println("you entered : " +amt +c);
			System.out.println();
			System.out.println("*********************************************");
			break;
		case 2:
			locale=locale.US;
			System.out.println("language :" +locale.getCountry() +"---"+locale.getLanguage());
			a=ms.getMessage("msg.pay", null,locale);
			b=ms.getMessage("msg.welcome", new Object[] {"Gaurav"},locale);
			c=ms.getMessage("msg.data",null,locale);
			d=ms.getMessage("msg.currency", null,locale);
			System.out.println("Pay : "+a);
			System.out.println("Welcome: "+b);
			
			System.out.println("Enter amount");
					 amt=sc.nextInt();
			System.out.println("you entered : " +amt +c);
			System.out.println();
			System.out.println("*********************************************");
			break;
		case 3:
			locale=locale.UK;
			System.out.println("language :" +locale.getCountry() +"---"+locale.getLanguage());
			a=ms.getMessage("msg.pay", null,locale);
			b=ms.getMessage("msg.welcome", new Object[] {"Gaurav"},locale);
			c=ms.getMessage("msg.data",null,locale);
			d=ms.getMessage("msg.currency", null,locale);
			System.out.println("Pay : "+a);
			System.out.println("Welcome: "+b);
			
			System.out.println("Enter amount");
					 amt=sc.nextInt();
			System.out.println("you entered : " +amt +c);
			System.out.println();
			System.out.println("*********************************************");
			break;
		case 4:
			System.out.println("ENDED");
			break;
		}
		}while(choice!=4);
		}
	}
