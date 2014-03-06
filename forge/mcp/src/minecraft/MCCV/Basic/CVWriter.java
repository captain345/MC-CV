package MCCV.Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;


public class CVWriter {
	private BufferedReader templateReader;
	private PrintWriter cvwriter;
	
	private String[] keys = {"#KEY1", "#KEY2", "#KEY3", "#KEY4", "#KEY5", "#KEY6", "#KEY7", "#KEY8"};
	
	public CVWriter() {
		try {
			templateReader = new BufferedReader(new FileReader("template.txt"));
			cvwriter = new PrintWriter(new BufferedWriter(new FileWriter("cv.txt")));
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: No teplate found");
		}
		catch (IOException e) {
			System.out.println("ERROR: Unable to write to file \n" + e.getMessage());
		}
	}
	
	public void createCV(LinkedList<String> messages) {
		String template = readTemplate();
		String cv = insertMessages(template, messages);
		
		printCV(cv);
	}

	private String readTemplate() {
		String template = "";
		
		try {
			while (templateReader.ready()) {
				template += String.format("%s %n", templateReader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return template;
	}
	
	private String insertMessages(String template, LinkedList<String> messages) {
		
		for (int i = 0; i < 8; i++) {
			String key = keys[i];
			String message = messages.get(i);
			
			int startIndex = template.indexOf(key);
			int keyLength = key.length();
			
			template = template.substring(0, startIndex) + message + template.substring(startIndex+key.length(), template.length());
		}
		
		return template;
	}
	
	private void printCV(String cv) {
		cvwriter.print(cv);
		cvwriter.flush();
	}
	
}
