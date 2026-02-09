package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        // PrintWriter out = response.getWriter();

        if ("admin".equals(username) && "1234".equals(password)) {
            response.getWriter().println("<h1>Login Successful</h1>");
            // out.println(password);
 
        } else {
             response.getWriter().println("<h1>Login failed</h1>");
 
        }
    }
}

