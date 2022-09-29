package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=scanner.nextLine();
		String favFood;
		
		switch(country) {
		
		case "USA":
			favFood="burgers";
			break;
		case "Kazakhstan":
			favFood="burgers";
			break;
		case "Turkey":
			favFood="baklava";
			break;
		case "Venezuela":
			favFood="arepa";
			break;
		case "India":
			favFood="curry";
			break;
		case "Yemen":
			favFood="mandi";
			break;
		case "Afghanistan":
			favFood="Qaboli Palow";
			break;
		default:
			favFood="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and your favorite food is "+favFood);
	}

}
