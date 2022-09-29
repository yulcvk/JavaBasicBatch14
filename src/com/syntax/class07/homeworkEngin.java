package com.syntax.class07;

import java.util.Scanner;

public class homeworkEngin {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		
		double price = 3.5;
        double pay;
        
        System.out.println("pay the coffee price");

        do {
        	
        pay = aaa.nextDouble();

            if (pay < price) {
                System.out.println("give more");

            }
            else if(pay > price) {
                System.out.println("give less");


            }else System.out.println("Enjoy");





} while (pay!=price);
	}

}
