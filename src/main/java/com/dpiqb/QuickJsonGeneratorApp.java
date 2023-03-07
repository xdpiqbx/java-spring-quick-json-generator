package com.dpiqb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class QuickJsonGeneratorApp implements CommandLineRunner {
	@Autowired
	private Environment environment;
	public static void main(String[] args) {
		SpringApplication.run(QuickJsonGeneratorApp.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		String port = environment.getProperty("server.port");
		String address = environment.getProperty("server.address") == null
			? "localhost"
			: environment.getProperty("server.address");

		System.out.println("===============================================");
		System.out.println("Server is running on PORT: " + port);
		System.out.println("URL: http://" + address + ":" + port);
		System.out.println("===============================================");
	}
}
