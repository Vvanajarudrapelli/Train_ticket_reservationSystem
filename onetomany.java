package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.Trainpojo.Train;
import com.Trainpojo.passenger;
import java.util.List;
import java.util.ArrayList;
import com.Trainpojo.passenger;

public class onetomany {
	
	
public static List<passenger> getdata(String  Train_name ) throws SQLException
	{
		
		Connection con = jdbccon.getCon();
		String query = "select  p.Passenger_id, p.First_name, p.Last_name, p.Email,p.phone_number from ticketdetails.passenger p inner join ticketdetails.Train t on p.Passenger_id = t.fkPassenger_id and t.Train_name=?";
		PreparedStatement ps =con.prepareStatement(query);
		
		ps.setString(1, Train_name);
		
		ResultSet rs = ps.executeQuery();
		List<passenger> data = new ArrayList<passenger>();
		
		while(rs.next())
		{
			passenger p = new passenger();
			p.setPassenger_id(rs.getInt("Passenger_id"));
			p.setFirst_name(rs.getString("First_name"));
			p.setLast_name(rs.getString("Last_name"));
			p.setEmail(rs.getString("Email"));
			p.setPhone_number(rs.getInt("Phone_number"));
		
		
			
			
			data.add(p);
			
		}	
		return  data;
	}
	

	public static void main(String[] args) throws SQLException {
		
	onetomany l = new onetomany();	
		
    
     List<passenger> g =  l.getdata("local303");
     System.out.println(g);
     
     		}

}
