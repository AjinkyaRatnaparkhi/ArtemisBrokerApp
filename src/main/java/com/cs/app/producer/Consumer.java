package com.cs.app.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements MessageListener {

	@Override
	@JmsListener(destination = "TradeQ")
	public void onMessage(Message message) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Received message: " + message.getBody(Object.class));
		}catch (JMSException ex) {
			ex.printStackTrace();
		}
	}

}
