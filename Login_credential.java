package com.Trainpojo;

public class Login_credential {
	private int passenger_id;
	private String username;
	private String password;
	
	public Login_credential() {
		super();
	}
	public Login_credential(int passenger_id, String username, String password) {
		super();
		this.passenger_id = passenger_id;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login_credential [passenger_id=" + passenger_id + ", username=" + username + ", password=" + password
				+ "]";
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	}
