package com.example.chatting;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChattingController {
    @SendTo("/send")
    @MessageMapping("/receive")
    public ChattingDto chattingSocketHandler(ChattingDto chattingDto) {
        String userName = chattingDto.getUserName();
        String content = chattingDto.getContent();

        ChattingDto result = new ChattingDto(userName, content);
        return result;
    }
}
