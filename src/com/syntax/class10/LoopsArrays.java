package com.syntax.class10;

public class LoopsArrays {

	public static void main(String[] args) {
		
		String[][] arr= {
				{"John","Mike","Lisa","Jennifer"},
				{"Grade B","Grade A","Grade C","Grade D"}
					
		};
		
		for(String[] singleArray:arr) {//loops over 1D array
			for(String el:singleArray) {// loops over each element of 1 D array
				System.out.print(el+" ");
			}
			System.out.println();
		}

	}

}
