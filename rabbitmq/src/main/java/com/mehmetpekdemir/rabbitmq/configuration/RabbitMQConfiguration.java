package com.mehmetpekdemir.rabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Configuration
public class RabbitMQConfiguration {

	@Value("${rabbitmq.queue.name}")
	private String queueName;

	@Value("${rabbitmq.exchange.name}")
	private String exchangeName;

	@Value("${rabbitmq.routing.name}")
	private String routingName;
	
	@Bean
	public Queue queue() {
		return new Queue(queueName,true);
	}

	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange(exchangeName);
	}

	@Bean
	public Binding binding(final Queue queue, final DirectExchange directExchange) {
		return BindingBuilder.bind(queue).to(directExchange).with(routingName);
	}

}
