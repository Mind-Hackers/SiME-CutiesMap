package com.mindhackers.mqtt.client;

import com.google.gson.Gson;
import com.mindhackers.mqtt.client.model.Content;

public class JsonDataFactory {
	public static String getJson(Content content){
		
		Gson gson = new Gson();

		String json = gson.toJson(content);
		System.out.println(json);
		return json;
		
	}

}
