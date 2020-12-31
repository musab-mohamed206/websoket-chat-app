package com.example.websoket.model;

public class Message {
    private String content;
    private String sendet;
    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }

    public String getContent() {
        return content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getSendet() {
        return sendet;
    }

    public void setSendet(String sendet) {
        this.sendet = sendet;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
