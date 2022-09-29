package com.syntax.class12;

public class Homework3WithoutScanner {

	public static void main(String[] args) {
		
		String mom="Mary";
		String dad="Daniel";
		boolean boy=false;
		
		if(boy) {
			String firsthalf=dad.substring(0,dad.length()/2);
			String lasthalf=mom.substring(mom.length()/2);
			System.out.println(firsthalf+lasthalf);
			
		}else {
			String firsthalf=mom.substring(0,mom.length()/2);
			String lasthalf=dad.substring(dad.length()/2);
			System.out.println(firsthalf+lasthalf);
		}
	}

}
