package com.Trainpojo;

public class Station {
	private int Station_id;
	private String Station_name;
	private String location;
	
	public Station() {
		super();
	}
	public Station(int station_id, String station_name, String location) {
		super();
		Station_id = station_id;
		Station_name = station_name;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Station [Station_id=" + Station_id + ", Station_name=" + Station_name + ", location=" + location + "]";
	}
	public int getStation_id() {
		return Station_id;
	}
	public void setStation_id(int station_id) {
		Station_id = station_id;
	}
	public String getStation_name() {
		return Station_name;
	}
	public void setStation_name(String station_name) {
		Station_name = station_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	
	
}
