package com.syntax.class08;

public class HomeworkClock {

	public static void main(String[] args) {
		
		for (int a = 0; a <= 2; a++) {
            for (int b= 0; b <= 9; b++) { 
            	
            	if (a==2 && b>3) {break;}
                
            	for (int c = 0; c <= 5; c++) {
                    for (int d = 0; d <= 9; d++) {

                        System.out.println("The time is " + a + b + ":" + c + d + " o'clock");
                    }

}
            }
}
	}}