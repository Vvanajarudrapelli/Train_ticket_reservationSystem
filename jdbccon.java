package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbccon {

	public static Connection getCon()
	{
		Connection con = null;
	      try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketdetails","root","root");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	      
		
	}
	
}
