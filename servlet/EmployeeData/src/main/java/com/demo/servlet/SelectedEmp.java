package com.demo.servlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Employee;


@WebServlet("/selectedemp")
public class SelectedEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] s = request.getParameterValues("select");
		HttpSession session = request.getSession();
		Set<Employee> eset = (Set<Employee>) session.getAttribute("eset");
		if(eset==null) {
			eset=new HashSet<>();
		}
		for(String emp:s) {
			String [] semp=emp.split(":");
			Employee e = new Employee(Integer.parseInt(semp[0]),semp[1],Float.parseFloat(semp[2]));
			eset.add(e);
		}
		session.setAttribute("eset", eset);
		RequestDispatcher rd = request.getRequestDispatcher("showselected.jsp");
		rd.forward(request, response);
	}

}
