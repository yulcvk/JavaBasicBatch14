package com.syntax.class11;

public class HomeworkReviewTester {

	public static void main(String[] args) {
		
		HomeworkReview iphone=new HomeworkReview();
		
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		HomeworkReview samsung=new HomeworkReview();
		
		samsung.model="S22 Ultra";
		samsung.make="Samsung";
		samsung.year=2022;
		samsung.makeCall();
	}

}
