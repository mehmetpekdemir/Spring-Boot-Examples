package com.mehmetpekdemir.rabbitmq.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.mehmetpekdemir.rabbitmq.model.Notification;


/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Component
public class NotificationListener {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationListener.class);

	@RabbitListener(queues = {"${rabbitmq.queue.name}"})
	public void handleOnMessage(Notification notification) {
		LOGGER.info("Notification Listener : " + notification.toString());
	}

}
