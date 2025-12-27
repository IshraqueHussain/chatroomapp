package com.chat.app.controller;

import com.chat.app.MessageService;
import com.chat.app.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    public final MessageService messageService;
    public final SimpMessagingTemplate simpleMessagingTemplate;

    public MessageController(MessageService messageService, SimpMessagingTemplate simpleMessagingTemplate){
        this.messageService=messageService;
        this.simpleMessagingTemplate =simpleMessagingTemplate;
    }

    @MessageMapping("/sendMessage")
    public void sendMessage(Message message){

        Message savedMessage = messageService.processMessage(message);

        if(savedMessage == null){
            return;
        }

        String room = savedMessage.getRoom().toLowerCase().trim();

        simpleMessagingTemplate.convertAndSend(
                "/topic/public/" + room,
                savedMessage
        );
    }
    @MessageMapping("/private-message")
    public void sendPrivateMessage(Message message){
        simpleMessagingTemplate.convertAndSendToUser(
                message.getReceiver(),
                "/queue/messages",
                message);
    }

}
