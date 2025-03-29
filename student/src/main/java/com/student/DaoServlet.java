package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/list")
public class DaoServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException, IOException{
	
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String phy=req.getParameter("phy");
	String che=req.getParameter("che");
	String mat=req.getParameter("mat");
	
	PrintWriter pw=res.getWriter();
	pw.println("id"+id);
	pw.println("name"+name);
	pw.println("phy"+phy);
	pw.println("che"+che);
	pw.println("mat"+mat);
}
}
