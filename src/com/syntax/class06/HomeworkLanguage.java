package com.syntax.class06;

import java.util.Scanner;

public class HomeworkLanguage {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String language;
		String country=scanner.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Venezuela":
			language="Spanish";
			break;
		case "Austria":
			language="German";
			break;
		default:
			language="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and you speak "+language);
	}

		
	}


