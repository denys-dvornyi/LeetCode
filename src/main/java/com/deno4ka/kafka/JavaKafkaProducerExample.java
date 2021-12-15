package com.deno4ka.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class JavaKafkaProducerExample {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
//		String server = "localhost:9092";
//		String topicName = "test";
//		String newTopic = "newTopic";

		final Properties props = new Properties();
		try {
			props.load(new FileReader(new File("kafka.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
//		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
//		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		final Producer<Long, String> producer = new KafkaProducer<>(props);

		RecordMetadata recordMetadata = (RecordMetadata) producer.send(new ProducerRecord("test", "example message test")).get();
		if (recordMetadata.hasOffset()) {
			System.out.printf("Message to %s topic sent successfully%n", "test");
		}

//		recordMetadata = (RecordMetadata) producer.send(new ProducerRecord(newTopic, "example message newTopic")).get();
//		if (recordMetadata.hasOffset()) {
//			System.out.printf("Message to %s topic sent successfully%n", topicName);
//		}
		producer.close();
	}

}
