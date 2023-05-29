package com.example.BikeStore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")
public class Bike {

	@Id
	private int id;
	@Override
	public String toString() {
		return "Bike [id=" + id + ", bikename=" + bikename + ", bikemodel=" + bikemodel + ", price=" + price
				+ ", engine=" + engine + ", power=" + power + ", torque=" + torque + ", mileage=" + mileage
				+ ", fueltankcapacity=" + fueltankcapacity + ", colours=" + colours + "]";
	}
	public Bike() {
		super();
	}
	public Bike(int id, String bikename, String bikemodel, String price, String engine, String power, String torque,
			String mileage, String tyretype, String fueltankcapacity, String colours) {
		super();
		this.id = id;
		this.bikename = bikename;
		this.bikemodel = bikemodel;
		this.price = price;
		this.engine = engine;
		this.power = power;
		this.torque = torque;
		this.mileage = mileage;
		
		this.fueltankcapacity = fueltankcapacity;
		this.colours = colours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getBikemodel() {
		return bikemodel;
	}
	public void setBikemodel(String bikemodel) {
		this.bikemodel = bikemodel;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	public String getFueltankcapacity() {
		return fueltankcapacity;
	}
	public void setFueltankcapacity(String fueltankcapacity) {
		this.fueltankcapacity = fueltankcapacity;
	}
	public String getColours() {
		return colours;
	}
	public void setColours(String colours) {
		this.colours = colours;
	}
	private String bikename;
	private String bikemodel;
	private String price;
	private String engine;
	private String power;
	private String torque;
	private String mileage;
	
	private String fueltankcapacity;
	private String colours;

}
