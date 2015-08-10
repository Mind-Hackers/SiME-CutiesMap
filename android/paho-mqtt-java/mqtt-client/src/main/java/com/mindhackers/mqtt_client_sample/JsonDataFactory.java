package com.mindhackers.mqtt_client_sample;

import com.google.gson.Gson;
import com.mindhackers.mqtt_client_sample.model.Content;

public class JsonDataFactory {
	public static String getJson(Content content){
		
		Gson gson = new Gson();

		String json = gson.toJson(content);
		System.out.println(json);
		return json;
		
	}

}
