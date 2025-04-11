package com.demoapp;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class squareServlet extends HttpServlet{
		
		public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
	
			
			int k = (int)req.getAttribute("k");
			k = k*k;
		PrintWriter out = res.getWriter();
		out.print("Result is " + k);
		
		
		out.println();
		out.print("hi");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("phone");
		out.print(str);
		
			
		
		
			
		}
		
		
	}


