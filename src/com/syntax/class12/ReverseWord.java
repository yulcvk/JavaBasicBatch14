package com.syntax.class12;

public class ReverseWord {

	public static void main(String[] args) {
		
		String word="Watermelon";
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}

}
}