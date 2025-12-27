package com.chat.app.models;

public class Message {
    private String name;
    private String content;
    private String receiver;
    private String room;
    private String time;

    public Message(){

    }
    public Message (String name, String content,String receiver, String room, String time){
        this.name=name;
        this.content=content;
        this.receiver=receiver;
        this.room=room;
        this.time=time;
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
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver){
        this.receiver=receiver;
    }
    public String getRoom(){
        return room;
    }
    public void setRoom(String room){
        this.room=room;
    }
}

