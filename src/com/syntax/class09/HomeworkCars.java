package com.syntax.class09;

public class HomeworkCars {

	public static void main(String[] args) {
		
		String[] cars= {"BMW","Toyota","Fiat","Honda","Audi","Nissan"};
		for(String model:cars)
		System.out.println(model+" ");
		
		System.out.println("-------------------------------");
		
		for(int a=0;a<cars.length;a++) {
			System.out.println(cars[a]+" ");
		}

	}
   
}
