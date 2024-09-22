package com.Trainpojo;

public class Train {
	private int Train_id;
	private String Train_name; 
	private String train_type;
	private  int capacity;
	
	public Train() {
		super();
	}
	public Train(int train_id, String train_name, String train_type, int capacity) {
		super();
		Train_id = train_id;
		Train_name = train_name;
		this.train_type = train_type;
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Train [Train_id=" + Train_id + ", Train_name=" + Train_name + ", train_type=" + train_type
				+ ", capacity=" + capacity + "]";
	}
	public int getTrain_id() {
		return Train_id;
	}
	public void setTrain_id(int train_id) {
		Train_id = train_id;
	}
	public String getTrain_name() {
		return Train_name;
	}
	public void setTrain_name(String train_name) {
		Train_name = train_name;
	}
	public String getTrain_type() {
		return train_type;
	}
	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	}
