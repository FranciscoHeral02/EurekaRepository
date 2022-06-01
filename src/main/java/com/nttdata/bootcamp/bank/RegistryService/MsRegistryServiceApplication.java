package com.nttdata.bootcamp.bank.RegistryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRegistryServiceApplication.class, args);
	}

}
