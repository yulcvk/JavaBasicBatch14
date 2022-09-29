package com.syntax.class10;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		String [][] country= {
			
				{"Usa","Canada"},//1st array with index 0
				{"Peru","Brazil","Colombia","Ecuador"},//2nd array with index 1
				{"Ethiopia","Egypt","Kenya"},//index 2
				{"Germany","Turkey","Moldova","Ukraine"},//index 3
				{"Kazakhstan","Afghanistan","Korea"}//index 4
		};
		System.out.println(country.length);//5
		int elOf1arr=country[0].length;
		System.out.println("number of elements from 1 array = "+elOf1arr);
		
		int elOf2arr=country[1].length;
		System.out.println("number of elements from 2 array = "+elOf2arr);
		
		System.out.println("-----getting all values from 2d arrays using enhanced for loop-----");
		
		for(String[] names:country) {
			for(String c:names) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("-----getting all values from 2d array-----");
		
		for(int r=0;r<country.length;r++) {//loops over rows
			for(int c=0;c<country[r].length;c++) {
				System.out.print(country[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
