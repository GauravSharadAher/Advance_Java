package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService ps = (ProductService) ctx.getBean("productServiceImpl");
		do {
			System.out.println("1. add new Product\n 2. delete product by id\n 3. modify product\n 4.display all\n 5. display by id\n 6. sort by id\n7. exit\n Choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				ps.addProduct();
				break;
			case 2:System.out.println("Enter product id");
				int id=sc.nextInt();
				boolean status=ps.deleteById(id);
				if(status) {
					System.out.println("Deleted Sucessufully");
				}else {
					System.out.println("Product not found");
				}
				break;
			case 3:
				System.out.println("Enter product id");
				 id=sc.nextInt();
				 System.out.println("Enter quantity to modify");
				 int qty=sc.nextInt();
				 System.out.println("Enter price to modify");
				 float price=sc.nextFloat();
				 status=ps.modifyById(id,qty,price);
				if(status) {
					System.out.println("Modified Sucessufully");
				}else {
					System.out.println("Product not found");
				}
				break;
			case 4:
				List<Product> plist=ps.displayAll();
				plist.forEach(System.out::println);
				break;
			case 5:
				System.out.println("Enter product id");
				id=sc.nextInt();
				Product p=ps.displayById(id);
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("Product not found");
				}
				break;
			case 6:
				 plist=ps.sortByprice();
				 plist.forEach(System.out::println);
				break;
			case 7:
				((ClassPathXmlApplicationContext)ctx).close();
				System.out.println("Thankyou for visiting");
				break;
			default:System.out.println("Invalid input");
					break;
			}
		}while(choice!=7);
	}

}
