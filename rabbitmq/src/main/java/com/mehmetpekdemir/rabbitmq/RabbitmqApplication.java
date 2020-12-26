package com.mehmetpekdemir.rabbitmq;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mehmetpekdemir.rabbitmq.model.Notification;
import com.mehmetpekdemir.rabbitmq.producer.NotificationProducer;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@SpringBootApplication
public class RabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}

	@Bean
	CommandLineRunner createInitialNotifications(NotificationProducer notificationProducer) {
		return (args) -> {
			
			Notification notification = new Notification();
			notification.setId(UUID.randomUUID().toString());
			notification.setCreatedAt(new Date());
			notification.setMessage("Message");
			notification.setSeen(Boolean.FALSE);
			notificationProducer.sendToQueue(notification);
			
			Notification notification1 = new Notification();
			notification1.setId(UUID.randomUUID().toString());
			notification1.setCreatedAt(new Date());
			notification1.setMessage("Message 1");
			notification1.setSeen(Boolean.FALSE);
			notificationProducer.sendToQueue(notification1);
			
			Notification notification2 = new Notification();
			notification2.setId(UUID.randomUUID().toString());
			notification2.setCreatedAt(new Date());
			notification2.setMessage("Message 2");
			notification2.setSeen(Boolean.FALSE);
			notificationProducer.sendToQueue(notification2);
			
		};
	}
} 
