package com.chat.app;

import org.springframework.boot.SpringApplication;

public class TestChatroomappApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChatroomappApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
