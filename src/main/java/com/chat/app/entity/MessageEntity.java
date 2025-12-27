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

    @Column(nullable = false)
    private String room;

    public MessageEntity(){}

    public MessageEntity(String name, String content, String room, String time){
       this.name=name;
       this.content=content;
       this.room=room;
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

    public String getRoom(){
        return room;
    }
    public void setRoom(String room){
        this.room=room;
    }
}
