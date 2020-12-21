package testNgConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProviderUtil.DataProviderTest;

public class TC0012_DataProviderFromOtherClass {
	
	@Test(dataProviderClass=DataProviderTest.class,dataProvider="getData")
	public void cumtomerDetailsTest(String firstName,String lastName,String phoneNo,String emailId,String course) {
		System.out.println("First Name ----"+firstName);
		System.out.println("Lastst Name ----"+lastName);
		System.out.println("Phone Number----"+phoneNo);
		System.out.println("Email ID ----"+emailId);
		System.out.println("Course Name ----"+course);

		
		}

	
	/*
	@Test(dataProviderClass=DataProviderTest.class,dataProvider="getData")
	public void cumtomerDataTest(String firstName,String lastName,String email,String phoneNo,String course) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(phoneNo);
		System.out.println(course);

	}*/
}
