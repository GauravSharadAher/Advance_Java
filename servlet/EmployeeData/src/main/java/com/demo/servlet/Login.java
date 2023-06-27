package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.LoginC;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("passwd");
		LoginService ls = new LoginServiceImpl();
		LoginC user= new LoginC(name,pass);
		LoginC ans =ls.checkUser(user);
		if(ans!=null) {
			System.out.println("in");
			RequestDispatcher rd = request.getRequestDispatcher("dept");
			rd.forward(request, response);
		}else {
			System.out.println("not");
			out.println("Invalid user");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
