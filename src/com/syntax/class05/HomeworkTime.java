package com.syntax.class05;

import java.util.Scanner;

public class HomeworkTime {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter current time");
		int time=scanner.nextInt();
		
		if(time>0 && time<=11) {
			System.out.println("it is morning");
		}else if(time>11 && time<=15) {
			System.out.println("it is afternoon");
		}else if(time>15 && time<=20) {
			System.out.println("it is evening");
		}else if(time>20 && time<=24) {
			System.out.println("it is night");
		}else
		{
			System.out.println("Time does not exist");
		}
	}

}
