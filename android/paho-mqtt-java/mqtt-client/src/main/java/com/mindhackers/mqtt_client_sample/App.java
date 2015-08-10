package com.mindhackers.mqtt_client_sample;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.mindhackers.mqtt_client_sample.model.Content;
import com.mindhackers.mqtt_client_sample.model.GeoPoint;
import com.mindhackers.mqtt_client_sample.model.Shot;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String topic = "/group/1ffb66a0-304e-11e5-a2cb-0800200c9a66/send_data";
		String contentStr = "Message from KC";
		int qos = 2;
		String broker = "tcp://isplanet.dyndns-office.com:1883";
		String clientId = "JavaSample";
		MemoryPersistence persistence = new MemoryPersistence();

		Content content = new Content();
		content.setDevID("80:C1:6E:F3:E7:6B");
		content.setDevName("KC");
		content.setGroupID("1ffb66a0-304e-11e5-a2cb-0800200c9a66");
		content.setSendTimestamp(String.valueOf(System.currentTimeMillis()));

		Shot shot = new Shot();
		shot.setMessage("Test");
		shot.setImageUrl("http://ab.unayung.cc/uploads/photo/file/000/000/030/LN07_005.jpg");
		shot.setPosition(new GeoPoint(25.042299, 121.507695));

		content.setShot(shot);
		contentStr = JsonDataFactory.getJson(content);

		// System.exit(0);

		try {
			MqttClient sampleClient = new MqttClient(broker, clientId,
					persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			System.out.println("Connecting to broker: " + broker);

			sampleClient.connect(connOpts);
			System.out.println("Connected");
			System.out.println("Publishing message: " + contentStr);

			MqttMessage message = new MqttMessage(contentStr.getBytes());
			message.setQos(qos);
			sampleClient.publish(topic, message);
			System.out.println("Message published");

			sampleClient.disconnect();
			System.out.println("Disconnected");

			System.exit(0);
		} catch (MqttException me) {

			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}
}
