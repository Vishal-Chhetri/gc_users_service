/**
 * 
 */
package com.computer.genuine.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Vishal Chhetri
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.computer.genuine.controller","com.computer.genuine.service"})
@EnableJpaRepositories("com.computer.genuine.repository")
@EntityScan("com.computer.genuine.model")
public class GcUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcUserServiceApplication.class, args);
	}
	
}
