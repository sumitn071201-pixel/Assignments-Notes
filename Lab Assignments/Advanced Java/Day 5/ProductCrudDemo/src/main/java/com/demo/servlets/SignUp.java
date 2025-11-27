package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class SignUp extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	      
	        response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			 String uname = request.getParameter("uname");
		     String email = request.getParameter("email");
		     String password = request.getParameter("password");
		     String role = request.getParameter("role");
		     MyUser user = new MyUser(uname, email, role);
			 LoginService lservice=new LoginServiceImpl();
			 boolean status=lservice.signUp(uname, email, role,password);
			if(status) {
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.forward(request, response);
			}else {
				out.print("<h1>Invalid credentials</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("SignUp.html");
				rd.include(request, response);
				
			}
			
	    }

}
