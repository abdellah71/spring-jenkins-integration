package org.abd.jenkins.integration.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

	@PostConstruct
	public void initial(){

		logger.info("Application started...");

	}

	public static void main(String[] args) {

		logger.info("Application executed...");

		System.out.println("Hello..");

		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
