//Class to handle user input
//This is a singletone class, please don't create public constructors =)

package MCCV.Basic;

import java.util.LinkedList;

public class ChatInputHandler {
	private static ChatInputHandler instance = null; //this should be private
	private LinkedList<String> messages; // used to store confirmed messages
	private String unconfirmedMessage;
	
	//All constructors need to be private as well
	private ChatInputHandler() {
		messages = new LinkedList<String>();
		unconfirmedMessage = null;
	}
	
	//This method is used to get and instance of this class
	//It insures that at all time we have only one copy of chat handler
	public static ChatInputHandler getInstance() {
		if (instance == null) {
			instance = new ChatInputHandler();
			return instance;
		}
		else {
			return instance;
		}
	}
	
	public void addMessage(String m) {
		unconfirmedMessage = m;
	}
	
	public void confirmLastMessage() {
		if (messagePending()) {
			messages.add(unconfirmedMessage);
			unconfirmedMessage = null;
		}
	}
	
	public void discardLastMessage() {
		if (messagePending()) {
			unconfirmedMessage = null;
		}
	}
	
	public boolean messagePending() {
		return (unconfirmedMessage != null);
	}
	
	
}