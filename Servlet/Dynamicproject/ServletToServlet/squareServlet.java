package com.demoapp;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class squareServlet extends HttpServlet{
		
		public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
	
		PrintWriter out = res.getWriter();
		out.print("hello to sq");
			
			
		}
		
		
	}
