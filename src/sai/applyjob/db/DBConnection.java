package sai.applyjob.db;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:mysql://192.168.1.123:3306/testdb";
		String user = "sai";
		String password = "sai";
		
		/*
		String url = "jdbc:postgresql://192.168.1.122:5432/mypgdatabase";
		String user = "mypguser";
		String password = "mypguserpass";
		*/
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			//Class.forName("org.postgresql.Driver");
			conn = (Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	

}
