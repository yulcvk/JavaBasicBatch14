package com.syntax.ProjectJava;

public class ProjectDuplicate {

	public static void main(String[] args) {
		
		String[] name= {"John","Mike","Steve","John","Jen","Mike"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j])
					System.out.println(name[j]+" ");
			}
		}
	}

}
