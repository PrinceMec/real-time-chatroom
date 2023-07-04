package com.realtimechatroom.controllers;



import com.realtimechatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    //To send messages to everyone
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {
        return message;
    }
}
