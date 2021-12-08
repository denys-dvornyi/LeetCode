package com.deno4ka.kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JavaKafkaCreateTopicExample {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.load(new FileReader(new File("kafka.properties")));

		AdminClient adminClient = AdminClient.create(properties);
		NewTopic newTopic = new NewTopic("newTopic", 1, (short)1); //new NewTopic(topicName, numPartitions, replicationFactor)

		List<NewTopic> newTopics = new ArrayList<NewTopic>();
		newTopics.add(newTopic);

		adminClient.createTopics(newTopics);
		adminClient.close();
	}

}
