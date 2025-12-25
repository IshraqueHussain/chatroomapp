package com.chat.app;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatroomappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomappApplication.class, args);
		System.out.println("Hello");
	}

}
