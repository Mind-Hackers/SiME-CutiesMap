package com.mindhackers.mqtt.client.model.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
@Deprecated
public class DataItem {
	@SerializedName("e")
	private List<DataItem> collection;



	@SerializedName("v")
	private String key;

	@SerializedName("n")
	private String numberValue;

	@SerializedName("sv")
	private String StringValue;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(String numberValue) {
		this.numberValue = numberValue;
	}

	public String getStringValue() {
		return StringValue;
	}

	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}
	
	public void addDataItem(DataItem dataItem){
		if(collection == null){
			collection = new ArrayList<DataItem>();
		}
		collection.add(dataItem);
	}
	
/*	public List<DataItem> getCollection() {
		return collection;
	}

	public void setCollection(List<DataItem> collection) {
		this.collection = collection;
	}
*/
}
