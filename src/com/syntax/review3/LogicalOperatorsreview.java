package com.syntax.review3;

public class LogicalOperatorsreview {

	public static void main(String[] args) {
		
		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework=true;
		
		if(programmer &&manualTester&& knowFramework) {
			System.out.println("You can be an automation engineer");
		}else {
			System.out.println("You must know programming language and manual testing " +"to be an automation engineer");
		}

	}

}
