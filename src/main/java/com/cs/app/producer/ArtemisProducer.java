package com.cs.app.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ArtemisProducer {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jms.queue.destination}")
	String destination;
	
	public void send() {
		System.out.println("msg sent to queue ");
		jmsTemplate.convertAndSend(destination, "Message sent to Artemis Server !!");
	}
}
