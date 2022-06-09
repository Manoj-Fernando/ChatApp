package com.chat.chatapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String sender;
    private String content;
    private String timeStamp;
}
