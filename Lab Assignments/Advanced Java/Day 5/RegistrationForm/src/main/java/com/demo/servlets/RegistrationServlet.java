package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.RegistrationService;
import com.demo.service.RegistrationServiceImpl;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");  
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");
        String city = request.getParameter("city");

        RegistrationService rservice = new RegistrationServiceImpl();
        MyUser user = rservice.registerUser(name, email, gender, hobbies, city);

        if (user != null) {
            out.println("<h2>Registration Successful!</h2>");
            RequestDispatcher rd = request.getRequestDispatcher("Login.html");
            rd.include(request, response);
        } else {
            out.println("<h2>Registration Failed. Try again.</h2>");
            RequestDispatcher rd = request.getRequestDispatcher("registration.html");
            rd.include(request, response);
        }
    }
 
}
