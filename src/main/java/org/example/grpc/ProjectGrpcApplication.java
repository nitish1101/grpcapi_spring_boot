package org.example.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectGrpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGrpcApplication.class, args);
		System.out.println("HELLO gRPC !");
	}



}
