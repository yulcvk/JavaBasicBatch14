package com.syntax.ProjectJava;

public class ProjectMaxMin {

	public static void main(String[] args) {
		
		int[] num= {25,46,78,8,77};
		int largest=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) largest=num[i];
		
		}
		System.out.println(largest);
		
		int smallest=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]<smallest) smallest=num[i];
	}
		System.out.println(smallest);

}
}