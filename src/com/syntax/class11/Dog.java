package com.syntax.class11;

public class Dog {
	
	//State
	//attributes/properties/fields

	String name;
	String color;
	String breed;
	double weight;
	int age;
	//these are behaviors of the dog
	void bark() {
		System.out.println("Barking....");
	}
		void sleep() {
			System.out.println("Dog is sleeping...");
		}
		public static void main(String[] args) {
			//creating objects from a class
			//new Dog(); creates an object of class Dog
			Dog dog1=new Dog();
			//calling a behavior on an object
			dog1.bark();
			dog1.sleep();
		}

	}


