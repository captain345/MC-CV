package MCCV.Basic;

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
	
	@ForgeSubscribe
	public void onServerChatEvent(ServerChatEvent event) {
		output.println(event.message);
		output.flush();
	}
}