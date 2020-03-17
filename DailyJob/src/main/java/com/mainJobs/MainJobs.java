package com.mainJobs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class MainJobs {
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		long dateNow=date.getTime();
		String convertedDate=String.valueOf(dateNow);
		writeToFile(args[0],args[1],convertedDate);
		System.out.println("First Parameter: "+args[0]);
		System.out.println("Second Parameter: "+args[1]);
	}
	
	public static void writeToFile(String message1,String message2, String message3) throws IOException {
		String text = message1+"      "+message2 +" "+message3;
		BufferedWriter output = null;
		try {
			File file = new File("example.txt");
			output = new BufferedWriter(new FileWriter(file));
			output.write(text);
			output.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}
}
