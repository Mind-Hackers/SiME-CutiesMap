package com.mindhackers.shotmap.model;

import java.util.Calendar;

public class ShotItem {

	private String id;
	private Calendar findDateTime;

	private double latitude;
	private double longitude;
	private String picUrl;

	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public Calendar getFindDateTime() {
		return findDateTime;
	}

	public void setGeoPoint(double latitude, double longitude){
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public void setFindDateTime(Calendar findDateTime) {
		this.findDateTime = findDateTime;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
