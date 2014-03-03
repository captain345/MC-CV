package MCCV.Basic;

import ibxm.Player;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.ServerChatEvent;



public class ChatEventHook {
	PrintWriter output;
	
	public ChatEventHook() {
		
		try {
		 output = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void test(){
	
	}
	
	
	@ForgeSubscribe
	public void onServerChatEvent(ServerChatEvent event) {
		ChatInputHandler chatHandler = ChatInputHandler.getInstance();
		if (chatHandler.messagePending()) {
			if (event.message.equalsIgnoreCase("y")) {
				chatHandler.confirmLastMessage();
				event.player.addChatMessage("Input confirmed");
			}	
			else if (event.message.equalsIgnoreCase("n")) {
				chatHandler.discardLastMessage();
				event.player.addChatMessage("Input discarded");
			}
			else
				event.player.addChatMessage("Please enter y or n");
		}
		else {
			chatHandler.addMessage(event.message);
			event.player.addChatMessage("Can you please confirm that input? \n y or n");
		}
	}
}