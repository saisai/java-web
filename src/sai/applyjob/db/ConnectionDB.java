package sai.applyjob.db;

import java.io.*;
import java.sql.*;

public class ConnectionDB {
	
	
	private static ConnectionDB instance = new ConnectionDB();
	String url = "jdbc:mysql://192.168.1.123:3306/testdb";
	String user = "sai";
	String password = "sai";
	String driverClass = "com.mysql.jdbc.Driver";
	
	
	public ConnectionDB () {
		
		try{
			Class.forName(driverClass);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
	
	
	public static ConnectionDB getInstance(){
		return instance;
	}
	
	
	
	public Connection getConnection () throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public Connection getConnection (String url, String user, String password) throws SQLException, ClassNotFoundException{
		
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}	
	
	
	

}
