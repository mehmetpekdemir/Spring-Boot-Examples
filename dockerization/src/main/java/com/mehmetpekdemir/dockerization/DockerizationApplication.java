package com.mehmetpekdemir.dockerization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@SpringBootApplication
public class DockerizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizationApplication.class, args);
	}

	@RestController
	static class DummyController {

		@GetMapping("/hello")
		public String sayHello() {
			return "Hello World !";
		}

	}

}
