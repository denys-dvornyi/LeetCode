package com.deno4ka.kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.admin.TopicListing;
import org.apache.kafka.common.KafkaFuture;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class KafkaAdminClient {

    private static AdminClient adminClient;

    public KafkaAdminClient() {
        initAdminClient();
    }

    public static void main(String[] args) {
        KafkaAdminClient main = new KafkaAdminClient();
        try {
            List<String> allTopics = main.getAllTopics();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (adminClient != null) {
                adminClient.close();
            }
        }
    }

    private void createTopic() {
        NewTopic newTopic = new NewTopic("newTopic", 1, (short) 1); //new NewTopic(topicName, numPartitions, replicationFactor)
        List<NewTopic> newTopics = new ArrayList<>();
        newTopics.add(newTopic);
        adminClient.createTopics(newTopics);
    }

    private List<String> getAllTopics() throws ExecutionException, InterruptedException {
        try {
            ListTopicsResult listTopicsResult = adminClient.listTopics();
            KafkaFuture<Collection<TopicListing>> listings = listTopicsResult.listings();
            Collection<TopicListing> topicListings = listings.get();
            List<String> allTopics = new ArrayList<>();
            for (TopicListing topicListing : topicListings) {
                allTopics.add(topicListing.name());
            }
            return allTopics;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void initAdminClient() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(new File("kafka.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        adminClient = AdminClient.create(properties);
    }

}
