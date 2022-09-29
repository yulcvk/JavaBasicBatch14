package com.syntax.class09;

public class TaskArrays {

	public static void main(String[] args) {
		

		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		System.out.println("-------------------------");
		
		char[]grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		System.out.println("----------------------");
		
		String[] names= {"Ali","Yusuf","Humera","Yulia"};
		System.out.println(names[3]);
		
		System.out.println("-----------------------------");
		
		String[] name=new String[4];
		
		name[0]="Ali";
		name[1]="Yusuf";
		name[2]="Humera";
		name[3]="Yulia";
		
		System.out.println(name[3]);
		
		System.out.println("----------------------------");
		
		String[] days= {"Java","Saturday","day","coding","is"};
		
		System.out.print(days[1]+" "+days[4]+" "+days[0]+" "+days[3]+" "+days[2]);

	}

}
