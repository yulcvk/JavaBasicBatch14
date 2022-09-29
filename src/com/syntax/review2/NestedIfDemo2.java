package com.syntax.review2;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		
		boolean studyHard=true;
		
		if(studyHard) 
		{
			System.out.println("we get the job in first few weeks");
			
			boolean goodCommunicationSkills=true;
			
			if(goodCommunicationSkills) 
			{
				System.out.println("we might get a job in apple, amazon etc");
			}else 
			{
				System.out.println("we need to work on communication skills");
			}
		}
		else 
		{
			System.out.println("it might take a little longer to get the job");
		}
	}

}
