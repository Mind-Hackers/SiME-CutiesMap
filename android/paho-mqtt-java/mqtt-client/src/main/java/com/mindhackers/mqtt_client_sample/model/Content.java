package com.mindhackers.mqtt_client_sample.model;

import com.google.gson.annotations.SerializedName;

public class Content {
	private String devID;
	private String devName;
	private String groupID;
	private String sendTimestamp;
	@SerializedName("data")
	private Shot shot;

	public String getDevID() {
		return devID;
	}

	public void setDevID(String devID) {
		this.devID = devID;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getSendTimestamp() {
		return sendTimestamp;
	}

	public void setSendTimestamp(String sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
	}

	public Shot getShot() {
		return shot;
	}

	public void setShot(Shot shot) {
		this.shot = shot;
	}

}
