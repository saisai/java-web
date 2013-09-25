package sai.applyjob.dao;


import java.io.*;
import java.sql.*;

import sai.applyjob.db.ConnectionDB;

public class User {
	
	public static Connection connection;
	public static Statement stmt;
	
	public User() {}
	
	
	private static Connection getConnection() throws SQLException,ClassNotFoundException
	{
		Connection conn = ConnectionDB.getInstance().getConnection();
		return conn;
	}
	
	
	public static boolean checkUser(String user, String password)
	{
		String query = "SELECT * FROM tbl_user WHERE user_name='"+ user +"' AND user_password='" +password+"'" ;
		//System.out.println(query);
		//System.exit(0);
		int count = 0;
		try{
			
			connection = getConnection();
			//System.out.println(connection);
			//System.exit(0);
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			//System.exit(0);
			while(rs.next()){
				count++;
			}
			rs.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally
		{
			try{
				if(stmt != null)
					stmt.close();
				if(connection != null)
					connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		if(count > 0)
			return true;
		else
			return false;
	}

}
