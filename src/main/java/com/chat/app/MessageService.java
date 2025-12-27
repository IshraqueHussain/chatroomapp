package com.chat.app;

import com.chat.app.entity.MessageEntity;
import com.chat.app.models.Message;
import com.chat.app.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService (MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }

    public Message processMessage(Message message){
        if(message.getContent()==null || message.getContent().trim().isEmpty()){
         return null;
        }
        message.setTime(LocalTime.now().toString());
        String room = message.getRoom().toLowerCase().trim();

        MessageEntity entity= new MessageEntity(
                message.getName(),
                message.getContent(),
                room,
                message.getTime()
        );
        messageRepository.save(entity);
        return message;
    }
}
