package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * drivername=com.mysql.cj.jdbc.Driver
   url=jdbc:mysql://localhost:3306/db-name
   username=root
   password=root
 */
/**
 * 
 * @author xdavid
 *
 */
public class DBConenctionManager {
	
	private static Connection con = null;
	
	
	public static Connection getConnection() {
     
	try {
		String url="jdbc:mysql://localhost:3306/student_manage";
		String username="root";
		String password="root";
	  
		//load the driver
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    //create connection
	   con = DriverManager.getConnection(url,username,password);
	   
	}catch(ClassNotFoundException e2) {
		e2.printStackTrace();
	}catch(SQLException e3) {
		e3.printStackTrace();
	}
		return con;
	}
}


