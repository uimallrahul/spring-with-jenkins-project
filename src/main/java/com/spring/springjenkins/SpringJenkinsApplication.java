package com.spring.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("init method invoked........");
		logger.info("hi........");
	}
	@PreDestroy
	public void destroy()
	{
		logger.info("destroy method invoked........");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringJenkinsApplication.class, args);
		run.close();
		
	}

}
