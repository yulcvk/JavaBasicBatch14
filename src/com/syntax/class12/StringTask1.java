package com.syntax.class12;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		
		String userName="user1";
		String password="pass123";
		String confirmPassword="pass123";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter username");
		userName=scanner.next();
		System.out.println("Please enter password");
		password=scanner.next();
		System.out.println("Please enter password again");
		confirmPassword=scanner.next();
		
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("User name and Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
				System.out.println("Your user name and password has been created");
			}
		}

	}


