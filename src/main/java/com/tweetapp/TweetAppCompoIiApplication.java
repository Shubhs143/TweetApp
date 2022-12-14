package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@CrossOrigin(origins = "*")
public class TweetAppCompoIiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetAppCompoIiApplication.class, args);
	}

}
