package com.bn.bridge.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bn.bridge.service.ProducerService;

@RestController
@RequestMapping("/rest/api")
public class MessageController {
	
	@Autowired
	ProducerService producerService;
	
	@GetMapping("/producerMessage")
	public void getmessageFromClient(@RequestParam("message") String message) {
		producerService.sendMessageToTopic(message);
		
		
	}
	

}
