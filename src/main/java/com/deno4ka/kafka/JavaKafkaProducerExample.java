package com.deno4ka.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class JavaKafkaProducerExample {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		String server = "localhost:9092";
		String topicName = "test";
		String newTopic = "newTopic";

		final Properties props = new Properties();

		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		final Producer<Long, String> producer = new KafkaProducer<>(props);

		RecordMetadata recordMetadata = (RecordMetadata) producer.send(new ProducerRecord(topicName, "example message test")).get();
		if (recordMetadata.hasOffset()) {
			System.out.printf("Message to %s topic sent successfully%n", topicName);
		}

		recordMetadata = (RecordMetadata) producer.send(new ProducerRecord(newTopic, "example message newTopic")).get();
		if (recordMetadata.hasOffset()) {
			System.out.printf("Message to %s topic sent successfully%n", topicName);
		}
		producer.close();
	}

}
