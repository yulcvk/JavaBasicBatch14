package com.syntax.class05;

public class LogicalOR {

	public static void main(String[] args) {
		
		String day="Saturday";
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		}

		System.out.println("--------------------");
		
		double money=40000;
		
		String title="Manual tester";
		
		if(title.equals("Automation tester") || money ==120000) {
			System.out.println("Happy");
		}
	}

}
