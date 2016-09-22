package com.senso.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class Producer {

	private static final String TASK_QUEUE_NAME = "hello_queue2";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

		String messageOne = "Hello Message One";
		channel.basicPublish("", TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, messageOne.getBytes());
		System.out.println(" [x] Sent '" + messageOne + "'");
		
		String messageTwo = "Hello Message Two";
		channel.basicPublish("", TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, messageTwo.getBytes());
		System.out.println(" [x] Sent '" + messageTwo + "'");

		channel.close();
		connection.close();
	}
}
