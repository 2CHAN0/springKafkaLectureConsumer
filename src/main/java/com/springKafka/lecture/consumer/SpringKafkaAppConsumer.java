package com.springKafka.lecture.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaAppConsumer {
	//edit configuration -> allow parallel run
	//kafka-consumer-groups --bootstrap-server localhost:9092  --describe --all-groups
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaAppConsumer.class, args);
	}

}
