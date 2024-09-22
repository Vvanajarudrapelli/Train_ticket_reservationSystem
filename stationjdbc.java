package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class stationjdbc {
	
	public void savedat()
	{
		try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketdetails","root","root");
			Statement s =con.createStatement();	
			int row = s.executeUpdate("insert into ticketdetails.station values(4,'Boston North' ,'Boston' ,3)");
			System.out.println("inseted into -----"+row);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		stationjdbc d = new stationjdbc();
		d.savedat();
		}

}
