package com.java.core.scanner;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inter the firstnam :");
		String firstname = sc.next();
		
		System.out.println("inter last name :");
		String lastname = sc.next();
		
		System.out.println("inter your year : ");
		int year = sc.nextInt();
		
		usernamegenerator g = new usernamegenerator();
		String username = g.getusername(firstname, lastname, year);
		System.out.println("username is: " + username);
		
		sc.close();
		}
}


