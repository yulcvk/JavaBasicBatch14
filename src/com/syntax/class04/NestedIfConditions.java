package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int time=5;
		String day="Monday";
		
		if(day.equals("Monday")) {
			
			if(time>7) {
				System.out.println("Let's go to office");
				
			}
			
			if (time<6) {
				System.out.println("Lets sleep more");
				
			}
		}
	}

}
