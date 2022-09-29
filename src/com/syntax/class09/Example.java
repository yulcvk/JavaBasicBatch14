package com.syntax.class09;

public class Example {

	public static void main(String[] args) {
		
		String[] week= {"Monday","Sunday","Tuesday","Thursday","Friday"};
		
		//if day is Sunday then say it is fun day
		//otherwise it is boring day
		
		for(String day:week) {
			
			if(day.equals("Sunday")){
				System.out.println(day+" is a fun day");
			}else if(day.equals("Friday")) {
				System.out.println(day+" is a great day");
			}else {
				System.out.println(day+" is a boring day");
			}
					
			
			
		}
	}

}
