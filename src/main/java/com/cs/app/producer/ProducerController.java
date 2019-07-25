package com.cs.app.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
	ArtemisProducer producer;
	
	@GetMapping("/sendMessage")
	public String send() {
		
		producer.send();
		return "Message sent on server";
	}
	
}
