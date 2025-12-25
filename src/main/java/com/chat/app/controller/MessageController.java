package com.chat.app.controller;

import com.chat.app.MessageService;
import com.chat.app.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    public final MessageService messageService;

    public MessageController(MessageService messageService){
        this.messageService=messageService;
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public Message sendMessage(Message message){
        return messageService.processMessage(message);
    }
}
