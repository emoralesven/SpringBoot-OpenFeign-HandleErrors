package com.bffspringboot.emoralesv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableFeignClients
@ConfigurationProperties
public class EmoralesvApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmoralesvApplication.class, args);


	}

}
