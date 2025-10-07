package com.niqdev.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroInventoryNiqDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroInventoryNiqDevApplication.class, args);
	}

}
