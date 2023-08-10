package com.bn.bridge.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service 
public class ConsumerService {
	
	@KafkaListener(topics = "Topic_One", groupId = "group_one")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message received is " + receivedMessage);
	}

}
