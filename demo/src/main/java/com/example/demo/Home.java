package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {

	private String owner;
	private int doorNo;
	
	public Home() {
		System.out.println("constructor is called");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public void connect() {
		System.out.println("Connecting to the internet");
	}

}
