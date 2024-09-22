package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Trainpojo.Train;

public class manytomany {

	public static List<Train> getall( ) throws SQLException
	{
		
		Connection con = jdbccon.getCon();
		String query = "select  *from ticketdetails.Train t inner join ticketdetails.station s on t.train_id = s.fktrain_id";
		PreparedStatement ps =con.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		List<Train> data = new ArrayList<Train>();
		while(rs.next())
		{
			Train p = new Train();
			p.setTrain_id(rs.getInt("Train_id"));
		    p.setTrain_name(rs.getString("Train_name"));
		    p.setTrain_type(rs.getString("Train_type"));
		    p.setCapacity(rs.getInt("Capacity"));
			
			
			data.add(p);
			
		}	
		return  data;
	}
	
	public static void main(String[] args) throws SQLException {
		 manytomany l = new manytomany();
	     List<Train> g = l.getall();
	     System.out.println(g);
	    

	}

}
