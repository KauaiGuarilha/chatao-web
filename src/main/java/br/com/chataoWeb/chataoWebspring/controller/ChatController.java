package br.com.chataoWeb.chataoWebspring.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import br.com.chataoWeb.chataoWebspring.model.entity.ChatMessage;

@Controller
public class ChatController {

	@SendTo("/topic/public")
	@MessageMapping("/join-user")
	public ChatMessage joinUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}

	@SendTo("/topic/public")
	@MessageMapping("/chat-send")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}
}
