package com.example.kubernets.simple_kubernets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleKubernetesApplication.class, args);
	}

	@GetMapping("/")
	public String sample(){
		return "Achieve the kubernetes";
	}
	@GetMapping("/hi")
	public String autoDeployment(){
		return "well come to auto deploy ment";
	}

}
