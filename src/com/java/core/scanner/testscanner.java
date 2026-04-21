package com.java.core.scanner;

import java.util.Scanner;

public class testscanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age = sc.nextInt();
		System.out.println("your age is: " +age);
		
		System.out.println("enter your your name: ");
		String name = sc.next();
		System.out.println("your name is: " + name);
		sc.close();
	}

}
