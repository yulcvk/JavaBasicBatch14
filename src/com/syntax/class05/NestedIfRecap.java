package com.syntax.class05;

public class NestedIfRecap {
	//to format code cmd+shift+f

	public static void main(String[] args) {
		boolean allergy=true;
		
		String allergyType="pollen";
		if(allergy) {
			System.out.println("Lets check what allergy you have");
			if(allergyType.equalsIgnoreCase("Pollen")){
					System.out.println("Try to stay indoor");}
			else if(allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			}else if(allergyType.equals("Dairy")) {
				System.out.println("Stay away from Dairy");
			}else {
				System.out.println("We need to do some tests");
			}
		}else {
			System.out.println("You are lucky");
			
		}

	}

	}
