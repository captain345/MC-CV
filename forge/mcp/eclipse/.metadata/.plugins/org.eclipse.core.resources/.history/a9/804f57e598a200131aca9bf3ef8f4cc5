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
		event.player.addChatMessage("Can you please confirm that input? \n y or n");
		output.println(event.message);
		output.flush();
		
		
	}
}