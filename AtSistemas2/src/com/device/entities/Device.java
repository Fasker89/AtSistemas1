package com.device.entities;

public class Device {

	private String idName;
	private Integer state;

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return ""+idName + ": " + state + "";
	}

	public Device(String idName, Integer state) {
		super();
		this.idName = idName;
		this.state = state;
	}

	public Device(String idName) {
		super();
		this.idName = idName;
		this.state = 0;
	}

	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}

}
