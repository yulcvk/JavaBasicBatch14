package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isHungry=true;
		
		if(isHungry) {
			System.out.println("Let's eat something");
			
			if(3>2)
				System.out.println("There is a true statement inside paranthesis");
			
			double myBankBalance=2000;
			double theAmountThatIwantToTransfer=250;
			if (myBankBalance>theAmountThatIwantToTransfer)
				System.out.println("Funds transfered succesfully");
			else
				System.out.println("Please try again not enough balance");
		
			
		}

	}

}
