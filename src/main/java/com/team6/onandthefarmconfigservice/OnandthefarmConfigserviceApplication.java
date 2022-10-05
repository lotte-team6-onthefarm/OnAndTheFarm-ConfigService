package com.team6.onandthefarmconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OnandthefarmConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnandthefarmConfigserviceApplication.class, args);
	}

}
