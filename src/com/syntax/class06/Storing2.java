package com.syntax.class06;

import java.util.Scanner;

public class Storing2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter current time");
		int time=scanner.nextInt();
		
		String timeOfTheDay;
		
		if(time>0 && time<=11) {
			timeOfTheDay="Morning";
			
		}else if(time>11 && time<=15) {
			timeOfTheDay="Afternoon";
			
		}else if(time>15 && time<=20) {
			timeOfTheDay="Evening";
			
		}else if(time>20 && time<=24) {
			timeOfTheDay="Night";
		}else {
			System.out.println("Wrong number is entered");
			timeOfTheDay="Invalid";
		}
		
			System.out.println(timeOfTheDay);
		}

	}


