package com.mindhackers.mqtt.client.model;

public class Shot {
	private String message;
	private String imageUrl;
	private GeoPoint position;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public GeoPoint getPosition() {
		return position;
	}

	public void setPosition(GeoPoint position) {
		this.position = position;
	}

}
