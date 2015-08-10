package com.mindhackers.mqtt_client_sample.model.json;


@Deprecated
public class ContentPayload {

	private String devID;
	private String devName;
	private String groupID;
	private String sendTS;
	private DataItem data;

	public ContentPayload(String devID, String devName, String groupID,
			String sendTS) {
		this.devID = devID;
		this.devName = devName;
		this.groupID = groupID;
		this.sendTS = sendTS;
	}

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

	public String getSendTS() {
		return sendTS;
	}

	public void setSendTS(String sendTS) {
		this.sendTS = sendTS;
	}

	public DataItem getData() {
		return data;
	}

	public void setData(DataItem data) {
		this.data = data;
	}

}
