package com.coderscampus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.domain.Message;
import com.coderscampus.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/messages/{channelId}")
	public List<Message> getMessagesByChannelId (@PathVariable Long channelId) {
		List<Message> channelMessages = messageService.getMessagesByChannel(channelId);
		return channelMessages;
	}
	
	@PostMapping("/messages") 
	public void postMessagesToUserId (@RequestBody Message message) {
		messageService.addMessageToChannel(message);
	}
}
