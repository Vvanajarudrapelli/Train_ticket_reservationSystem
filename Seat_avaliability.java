package com.Trainpojo;

public class Seat_avaliability {

	private int seat_id;
	private String train_id;
	private String seat_number;
	private String seat_type;
	
	public Seat_avaliability() {
		super();
	}
	

	@Override
	public String toString() {
		return "Seat_avaliability [seat_id=" + seat_id + ", train_id=" + train_id + ", seat_number=" + seat_number
				+ ", seat_type=" + seat_type + "]";
	}


	public int getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}

	public String getTrain_id() {
		return train_id;
	}

	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}

	public String getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}

	public String getSeat_type() {
		return seat_type;
	}

	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}

	public Seat_avaliability(int seat_id, String train_id, String seat_number, String seat_type) {
		super();
		this.seat_id = seat_id;
		this.train_id = train_id;
		this.seat_number = seat_number;
		this.seat_type = seat_type;
	}
	
		}
