package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Trainpojo.passenger;
import com.Trainpojo.Login_credential;
import com.Trainpojo.Seat_avaliability;



public class onetoone {
	
	public Seat_avaliability getlogdetail(String train_name) throws SQLException
	{
		String query ="select l.seat_id,l.train_id,l.seat_number,l.Seat_type   "
				+ "from ticketdetails.train p inner join ticketdetails.Seat_avaliability l on  p.train_id= l.fktrain_id and p.train_name =? ";
		
		Connection con = jdbccon.getCon();
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, train_name);
		
		ResultSet rs = ps.executeQuery();
		Seat_avaliability d = new  Seat_avaliability();
		while(rs.next())
		{
	    d.setSeat_id(rs.getInt("Seat_id"));
	    d.setTrain_id(rs.getString("Train_id"));
	    d.setSeat_number(rs.getString("Seat_number"));
	    d.setSeat_type(rs.getString("Seat_type"));
	    
	  
			
		}
		return d;
	}

	
	public Login_credential getlogdetails(String first_name) throws SQLException
	{
		String query ="select l.passenger_id,l.username,l.password   "
				+ "from ticketdetails.passenger p inner join ticketdetails.Login_credential l on  p.Passenger_id= l.fkPassenger_id and p.first_name =? ";
		
		Connection con = jdbccon.getCon();
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, first_name);
		
		ResultSet rs = ps.executeQuery();
		Login_credential d = new  Login_credential();
		while(rs.next())
		{
	    d.setPassenger_id(rs.getInt("passenger_id"));
	    d.setUsername(rs.getString("Username"));
	    d.setPassword(rs.getString("Password"));
	    
	   
			
		}
		return d;
	}

	 public static void main(String[] args) throws SQLException {
		
		onetoone s = new onetoone();
		Seat_avaliability d = s.getlogdetail("Freight202");
		System.out.println(d);
		//Login_credential v =s.getlogdetails("renu");
		//System.out.println(v);
		

	}

}
