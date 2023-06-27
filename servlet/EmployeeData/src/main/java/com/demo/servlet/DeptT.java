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

import com.demo.beans.Dept;
import com.demo.service.DeptService;
import com.demo.service.DeptServiceImpl;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/dept")
public class DeptT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DeptService ds = new DeptServiceImpl();
		List<Dept> dlist=ds.show();
		request.setAttribute("dlist", dlist);
		System.out.println(dlist);
		RequestDispatcher rd=request.getRequestDispatcher("Dept.jsp");
		rd.forward(request, response);
	}

}
