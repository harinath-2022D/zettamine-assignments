package com.zettamine.java.day4;

public class Hosteller {
	private int roomNum;
	private String hostelName;
	
	public Hosteller(int roomNum, String hostelName) {
		super();
		this.hostelName = hostelName;
		this.roomNum = roomNum;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	
	
}
