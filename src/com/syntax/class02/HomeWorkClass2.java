package com.syntax.class02;

public class HomeWorkClass2 {

	public static void main(String[] args) {
		
		double a=23.56;
		double b=13.15;
		double f=1.10;
		
		double sum=a+b;
		double sub=a-b;
		double mult=a*b;
		double div=a/b;
		
		double tet=a+b-f;
		System.out.println(tet);
		
		
		System.out.println("The sum of 2 numbers 23.56 and 13.15 is " + (sum));
		System.out.println("The subtraction of 2 numbers 23.56 and 13.15 is " + (sub));
		System.out.println("The multiplication of 2 numbers 23.56 and 13.15 is " + (mult));
		System.out.println("The division of 2 numbers 23.56 and 13.15 is " + (div));
		
		float c=3.9f;
		float squ=c*c;
		
		System.out.println("The square of 3.9 equals to " +(squ));
		
		int wid=5;
		int hei=8;
		
		int per=wid+wid+hei+hei;
		int area=wid*hei;
		
		System.out.println("The perimeter of a rectangle with width 5 and height 8 equails to " +(per));
		System.out.println("The area of a rectangle with width 5 and height 8 equails to " +(area));
		
		
	}

}
