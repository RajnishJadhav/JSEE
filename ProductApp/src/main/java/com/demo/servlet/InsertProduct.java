package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.models.*;
import com.demo.service.*;


@WebServlet("/InsertProduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("pname");
		double price=Double.parseDouble(request.getParameter("price"));
		ProductService eservice=new ProductServiceImpl();
		MyProduct p=new MyProduct(id,name,price);
		eservice.addProduct(p);
		RequestDispatcher rd=request.getRequestDispatcher("DisplayProducts");
		rd.forward(request, response);
		
	}

}
