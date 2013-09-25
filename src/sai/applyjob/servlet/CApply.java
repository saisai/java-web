package sai.applyjob.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sai.applyjob.object.CCompany;
import sai.applyjob.db.ConnectionDB;
import java.sql.*;

/**
 * Servlet implementation class CApply
 */
@WebServlet("/CApply")
public class CApply extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CCompany company = new CCompany();
	
	public static Statement stmt; 
	String url = "jdbc:mysql://192.168.1.123:3306/testdb";
	String user = "sai";
	String password = "sai";
	
	Connection connection=null;	
       
   	/**
	 * @see Hhttps://www.facebook.com/photo.php?v=10151847047998010&set=vb.348644988542876&type=2&theater#ttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hell");
		PrintWriter pw = response.getWriter();
		pw.println("hello get");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("hell");
		//PrintWriter pw = response.getWriter();
		//pw.println("hello");
		/*
		String name = null;
		name = "Hello" + request.getParameter("txtCompanyName");
		if(request.getParameter("txtCompanyName").toString().equals(""))
		{ name="Hello User"; }
		response.setContentType("text/plain");  
		response.setCharacterEncoding("UTF-8");  
		response.getWriter().write(name);
		System.exit(0);
		*/		
		//System.out.println(request.getParameter("txtCompanyName"));

		
		
		company.setCompanyName(request.getParameter("txtCompanyName"));
		company.setEmail(request.getParameter("txtEmail"));
		company.setWebSite(request.getParameter("txtWebSite"));
		company.setPhoneNo(request.getParameter("txtPhoneNo"));
		company.setContactPerson(request.getParameter("txtContactPerson"));
		//company.setAddress(request.getParameter("txtAddress"));
		company.setSalary(request.getParameter("txtSalary"));
		/*
		System.out.println("hello");
		System.out.println(company.getCompanyName());
		//connection = conndb.getConnection(url, user, password);
		 */


		try{
			  Class.forName("org.gjt.mm.mysql.Driver");
			  connection = DriverManager.getConnection(url, user, password);
			  String preQuery = "INSERT INTO tbl_company (company_name, company_email, company_website, company_phoneno, company_contactperson, salary) VALUES (?, ?, ?, ?, ?, ?)";
			  PreparedStatement stmt = connection.prepareStatement(preQuery);
			  stmt.setString(1, company.getCompanyName());
			  stmt.setString(2, company.getEmail());
			  stmt.setString(3, company.getWebSite());
			  stmt.setString(4, company.getPhoneNo());
			  stmt.setString(5, company.getContactPerson());
			 // stmt.setString(6, company.getAddress());
			  stmt.setString(6, company.getSalary());		
			  stmt.executeUpdate();
			  //System.out.println(connection);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}

}
