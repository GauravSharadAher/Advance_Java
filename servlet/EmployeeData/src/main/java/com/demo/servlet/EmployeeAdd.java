package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


@WebServlet("/employeeAdd")
public class EmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int dno= Integer.parseInt(request.getParameter("dept"));
			EmployeeService es = new EmployeeServiceImpl();
			List<Employee> elist=es.getAllEmp(dno);
			request.setAttribute("elist", elist);
			request.setAttribute("dept", dno);
			System.out.println(elist);
			RequestDispatcher rd = request.getRequestDispatcher("addemp.jsp");
			rd.forward(request, response);
			
			
	}

}
