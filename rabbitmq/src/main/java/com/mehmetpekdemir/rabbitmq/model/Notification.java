package com.mehmetpekdemir.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Notification implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String message;

	private Date createdAt;

	private Boolean seen;

}
