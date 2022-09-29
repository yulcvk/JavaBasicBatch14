package com.syntax.class11;

public class HomeworkPhone {
	String color;
	String name;
	int memory;
	String make;
	boolean cheap;
	String model;
	
	void call() {
		System.out.println("has fast calling option");
	}
	void message() {
		System.out.println(" user can delete sent messages");
	}
	
	public static void main(String[] args) {
		
	
	HomeworkPhone iphone=new HomeworkPhone();
	
	iphone.color="pink";
	iphone.make="Apple";
	iphone.memory=128;
	iphone.cheap=false;
	iphone.model="Iphone 14";
	
	System.out.print("I have new "+iphone.model+" in "+iphone.color+" color and it ");
	iphone.call();
	
HomeworkPhone samsung=new HomeworkPhone();
	
	samsung.color="black";
	samsung.make="Samsung";
	samsung.memory=256;
	
	System.out.println("Latest "+samsung.color+" "+samsung.make+" has "+samsung.memory+" MB of memory");
	
HomeworkPhone pixel=new HomeworkPhone();
	
	pixel.color="white";
	pixel.make="Google";
	pixel.memory=128;
	pixel.name="Pixel";
	
	
	System.out.print(pixel.name+" phone's latest feature is that the ");
	pixel.message();
}
}


