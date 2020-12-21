package regressionSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC0011_DataProviderConcept {

	@Test(dataProvider="getData")
	public void cumtomerDetailsTest(String firstName,String lastName,String phoneNo,String emailId,String course) {
		System.out.println("First Name ----"+firstName);
		System.out.println("Lastst Name ----"+lastName);
		System.out.println("Phone Number----"+phoneNo);
		System.out.println("Email ID ----"+emailId);
		System.out.println("Course Name ----"+course);

		
		}
	
	@DataProvider
	public Object[][] getData() {
		
		
		Object details[][]=new Object[2][5];
		
		details[0][0]="Reshmi";
		details[0][1]="Das";
		details[0][2]="4168434213";
		details[0][3]="resh@gmail.com";
		details[0][4]="selenium";

		details[1][0]="Apple";
		details[1][1]="Das";
		details[1][2]="4164563872";
		details[1][3]="rappleh@gmail.com";
		details[1][4]="Api";

		return details;
		
		
	}
	
	
	/*@Test(dataProvider="getData")
	public void customerDataTest(String fN,String lN,String email,String pnNo,String subj) {
		System.out.println("First Name ----"+fN);
		System.out.println("Last Name ----"+lN);
		System.out.println("Email id ----"+email);
		System.out.println("Phone no ----"+pnNo);
		System.out.println("Subject  Name ----"+subj);

		
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object details[][]=new Object[2][5];
		details[0][0]="resh";
		details[0][1]="das";
		details[0][2]="res@gmail.com";
		details[0][3]="4162450975";
		details[0][4]="maths";
		
		
		
		
		details[1][0]="mango";
		details[1][1]="aahhs";
		details[1][2]="mango@gmail.com";
		details[1][3]="4160362718";
		details[1][4]="science";
		
		return details;
		
		
		
		
		
		
		
	}
	
	*/
	
	
}
