package com.syntax.class06;

public class switchDemo2 {

	public static void main(String[] args) {
		
		char choice='W';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
				break;
		
		}
		System.out.println(answer);
	}

}
//switch cannot use logical or relational operators (|| or &&/ >=<)
//Cannot work with boolean
//Cannot work with float/double and long data types