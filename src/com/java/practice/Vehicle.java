package com.java.practice;

import java.io.Serializable;

public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3828104436075938765L;
	private int Wheel;
	private String colour;
	private String name;
	public int getWheel() {
		return Wheel;
	}
	public void setWheel(int wheel) {
		Wheel = wheel;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Vehicle(int Wheel, String colour,String name) {
		this.Wheel=Wheel;
		this.colour=colour;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Vehicle [Name="+name+"Wheel=" + Wheel + ", colour=" + colour + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
