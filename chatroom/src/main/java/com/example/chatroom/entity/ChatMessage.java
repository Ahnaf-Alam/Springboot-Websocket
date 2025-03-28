package com.example.chatroom.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private com.example.chartroom.entity.MessageType type;
    private String content;
    private String sender;

    public String getSender() {
        return sender;
    }
}
