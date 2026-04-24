package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

	public String getReply(String message)
	{
		if(message==null || message.trim().isEmpty())
	     {
			return "Please send a valid message";
		  }
		String msg= message.toLowerCase().trim();
		
		switch(msg)
		{
		case "hi":
		case "hello":
			return "Hello !!";
		case "bye":
			return "GoodBye";
		case "how are you ":
			return "I'm just a bot, but I'm doing great";
		default :
			return "Sorry, I don't understand. Try saying hii or Bye";
		}
		
		
	}
		
}

