package com.rajkumar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4JExampleApplication {

	static final Logger logger = LogManager.getLogger(SpringBootLog4JExampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4JExampleApplication.class, args);
		logger.info("Test Information Message");
		logger.debug("Test Debug Message");
		logger.error("Test Error Message");
	}

}
