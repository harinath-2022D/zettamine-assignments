package com.zettamine.java.day3;

public class Hosteller extends NitStudent{
	private String hostelName;
	private int roomNum;
	
	
	
	public Hosteller(int id, String name, int departmentId, String gender, String phoneNum, String hostelName,
			int roomNum) {
		super(id, name, departmentId, gender, phoneNum);
		this.hostelName = hostelName;
		this.roomNum = roomNum;
	}

	
	
	public Hosteller() {
		super();
	}



	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	
}
