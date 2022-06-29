package com.example.awssampleapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwssampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwssampleappApplication.class, args);
	}
	
	
	@GetMapping("/health")
	public String health(){
		return "OK";
	}
	
	@GetMapping("/message")
	public String getMessage(){
		String ip = "";
		 try {
			ip = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello World @ "+ip;
	}
	
}

class ApiResponse{
	
	private String message;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
