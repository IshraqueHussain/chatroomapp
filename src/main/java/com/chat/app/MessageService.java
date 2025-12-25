package com.chat.app;

import com.chat.app.models.Message;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class MessageService {
    public Message processMessage(Message message){
        if(message.getContent()==null || message.getContent().trim().isEmpty()){
         return null;
        }
        message.setTime(LocalTime.now().toString());
        return message;
    }
}
