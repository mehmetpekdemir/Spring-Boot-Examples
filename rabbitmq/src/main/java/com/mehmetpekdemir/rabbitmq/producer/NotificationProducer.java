package com.mehmetpekdemir.rabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.mehmetpekdemir.rabbitmq.model.Notification;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Component
@RequiredArgsConstructor // Constructor Injection with lombok
public class NotificationProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationProducer.class);

	private final Queue queue;
	
	private final RabbitTemplate rabbitTemplate;

	public void sendToQueue(Notification notification) {
		LOGGER.info("Notification send : " + notification);
		rabbitTemplate.convertAndSend(queue.getActualName(), notification);
	}

}
