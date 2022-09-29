package com.syntax.class11;

public class HomeworkDog {
	
	String name;
	String breed;
	String color;
	int age;
	double weight;
	
	void play() {
		System.out.println("playing with kids in the garden");
	}
	void sleep() {
		System.out.println("sleeping the whole day");
	}
	void steal() {
		System.out.println("stealing food from the table");
	}
	
	public static void main(String[] args) {
		
		HomeworkDog Labrador =new HomeworkDog();
		
		Labrador.name="Lizzy";
		Labrador.age=5;
		Labrador.color="Golden";
		
		
		System.out.print("Dog named "+Labrador.name+" has a beautiful "+Labrador.color+" color, very cheerful and ");Labrador.play();
		
		HomeworkDog Husky=new HomeworkDog();

	
	Husky.name="Henry";
	Husky.breed="Husky";
	Husky.weight=57.5;
	Husky.age=12;
	
	
	System.out.print("Dog named "+Husky.name+" is "+Husky.age+" years old and he is ");Husky.sleep();
	
HomeworkDog Bulldog=new HomeworkDog();

	
	Bulldog.name="Zizi";
	Bulldog.weight=70.5;
	Bulldog.age=5;
	
	System.out.print("Dog named "+Bulldog.name+" is "+Bulldog.age+" years old and his weight is "+Bulldog.weight+" because he is ");
	Bulldog.steal();
	
}
}