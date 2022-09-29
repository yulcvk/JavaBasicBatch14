package com.syntax.class06;

import java.util.Scanner;

public class EnginFun {

	
		public static void main(String[] args) throws InterruptedException {
			Scanner aaa = new Scanner(System.in);

			int a = 10, o = 20, b = 15, p = 30, g = 40, pl = 15;
			System.out.println("These are the fruits we have at our farm:");
			System.out.println("1.Apples " + a + " kg");
			System.out.println("2.Oranges " + o + " kg");
			System.out.println("3.Bananas " + b + " kg");
			System.out.println("4.Peaches " + p + " kg");
			System.out.println("5.Grapes " + g + " kg");
			System.out.println("6.Plums " + pl + " kg");

			String fruits[] = { "Apples", "Oranges", "Bananas", "Peaches", "Grapes", "Plums" };
			System.out.println("Which fruit would you like to buy? Enter the number:");
			int num = aaa.nextInt();
			if (num == 1) {
				System.out.println("you have selected " + fruits[0]);

			} else if (num == 2) {
				System.out.println("you have selected " + fruits[1]);
			} else if (num == 3) {
				System.out.println("you have selected " + fruits[2]);
			} else if (num == 4) {
				System.out.println("you have selected " + fruits[3]);
			} else if (num == 5) {
				System.out.println("you have selected " + fruits[4]);
			} else if (num == 6) {
				System.out.println("you have selected " + fruits[5]);
			} else
				System.out.println("please enter a number between 1-6");
			System.out.println("How much would you like to buy? (KG)");
			int kg = aaa.nextInt();

			if ((num == 1) && (kg < a)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[0] + " and there is only " + (a - kg)
						+ " Kg left in our stock");

			} else if ((num == 2) && (kg < o)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[1] + " and there is only " + (o - kg)
						+ " Kg left in our stock");
			} else if ((num == 3) && (kg < b)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[2] + " and there is only " + (b - kg)
						+ " Kg left in our stock");
			} else if ((num == 4) && (kg < p)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[3] + " and there is only " + (p - kg)
						+ " Kg left in our stock");
			} else if ((num == 5) && (kg < g)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[4] + " and there is only " + (g - kg)
						+ " Kg left in our stock");
			} else if ((num == 6) && (kg < pl)) {
				System.out.println("you have bought " + kg + "Kg of " + fruits[5] + " and there is only " + (pl - kg)
						+ " Kg left in our stock");
			} else
				System.out.println("We don't have that much in our inventory. Sorry");
		}
	}


