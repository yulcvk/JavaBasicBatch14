package com.syntax.class10;

public class ArrayPrintAll {

	public static void main(String[] args) {
		

		String[][] arr= {
				{"John","Mike","Lisa","Jennifer"},
				{"Grade B","Grade A","Grade C","Grade D"}
					
		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
