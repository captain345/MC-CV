package MCCV.Basic;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.ServerChatEvent;



public class ChatEventHook {
	@ForgeSubscribe
	public void onServerChatEvent(ServerChatEvent event) {
		System.out.println("TEST TEST TEST: " + event.message);
	}
}