package com.java.core.scanner;

public class usernamegenerator {
	public String getusername(String fname, String lname, int yob){
		int year = yob % 100;
		String username = fname + lname + year;
		return username;
	}
}
