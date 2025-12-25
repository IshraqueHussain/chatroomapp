package com.chat.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name="message")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String content;
    private String time;

    public MessageEntity(){}

    public MessageEntity(String name, String content, String time){
       this.name=name;
       this.content=content;
       this.time=time;
    }

    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time=time;
    }
}
