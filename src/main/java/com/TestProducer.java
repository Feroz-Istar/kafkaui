package com;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class TestProducer {
	public static void main(String [] args) {
		String topicName = "users";
		/*
		 * String key = "Key1"; String value = "Value-1";
		 */

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092,localhost:9093");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		System.out.println("all user start time" + System.currentTimeMillis());
		System.out.println("all user end time" + System.currentTimeMillis());

		
				Producer<String, String> producer = new KafkaProducer<>(props);
				/*ProducerRecord<String, String> record = new ProducerRecord<>(topicName, Integer.toString(user.getId()),
						jsonObject.toString());*/
				producer.send(new ProducerRecord<String, String>("test", "king kong"));
				System.out.println("done " );
				
		

		System.out.println("SimpleProducer Completed.");
	}
	}

