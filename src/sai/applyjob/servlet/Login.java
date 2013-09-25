package sai.applyjob.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sai.applyjob.dao.User;
import sai.applyjob.functions.MyFunctions;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
	User newUser = new User();
	MyFunctions funs = new MyFunctions();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		//pw.println(user);
		String user = request.getParameter("txtname");
		String password = funs.md5(request.getParameter("txtpwd"));
		Boolean result;
		result = newUser.checkUser(user, password);
		if(result == true)
			response.sendRedirect("apply.jsp");
			//response.sendRedirect("apply.html");
			//pw.println("Success");
		else
			pw.println("Fail");
		
	}

}
