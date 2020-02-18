package com.capgemini.dd.entity;

import java.time.LocalDate;

public class TrackOrderDetails {
	
	
	private int orderId;
	private String supplierName;
	private String place;
	private LocalDate Date;

	public TrackOrderDetails(int orderId, String supplierName, String place, LocalDate date) {
		super();
		this.orderId = orderId;
		this.supplierName = supplierName;
		this.place = place;
		Date = date;
	}
	public TrackOrderDetails() {
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Order Id: " +orderId +" Supplier Name: " +supplierName+ "Place : " +place+ "Date :" +Date;
	}
	

}
