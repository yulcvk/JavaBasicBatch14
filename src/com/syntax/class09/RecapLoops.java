package com.syntax.class09;

public class RecapLoops {

	public static void main(String[] args) {
		
		for(int i=1;i<4;i++) {
			for(int j=0;j<=2;j++) {
			System.out.println("Hello");
		break;
		}
		System.out.println("Bye");
		
	}
		boolean day=true;
		for(int i=1;i<=3;i++) {
			while(day) {
				System.out.println("Good day");
				break;
			}
			System.out.println(i);
			
		}

}
}