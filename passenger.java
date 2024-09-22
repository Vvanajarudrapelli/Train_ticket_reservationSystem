package com.Trainpojo;

public class passenger {

	private int passenger_id;
	private String  first_name;
	private String last_name;
	private String email;
	private int phone_number;
	
	public passenger() {
		super();
	}
	public passenger(int passenger_id, String first_name, String last_name, String email, int phone_number) {
		super();
		this.passenger_id = passenger_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
	}
	
	@Override
	public String toString() {
		return "passenger [passenger_id=" + passenger_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + "]";
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
}
