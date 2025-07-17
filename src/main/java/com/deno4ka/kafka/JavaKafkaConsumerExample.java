package com.deno4ka.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class JavaKafkaConsumerExample {

    public static void main(String[] args) throws InterruptedException {
        String server = "localhost:9092";
        String topicName = "test";
        String groupName = "group";
        String offset = "latest";

        final Properties props = new Properties();

        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupName);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, offset);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        final Consumer<Long, String> consumer = new KafkaConsumer<>(props);

        TopicPartition tp = new TopicPartition(topicName, 0);
        List<TopicPartition> tps = List.of(tp);
        consumer.assign(tps);
//		consumer.seekToBeginning(tps);

        while (true) {
            ConsumerRecords<Long, String> consumerRecords = consumer.poll(Duration.ofMillis(30_000));
            if (!consumerRecords.isEmpty()) {
                Iterator<ConsumerRecord<Long, String>> iterator = consumerRecords.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().value());
                }
            }
            Thread.sleep(1_000);
            if (false) {
                break;
            }
        }
        consumer.close();
    }

}
