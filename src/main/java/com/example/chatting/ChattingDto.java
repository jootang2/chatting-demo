package com.example.chatting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChattingDto {
    private String userName;
    private String content;
}
