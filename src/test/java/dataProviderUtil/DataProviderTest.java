package dataProviderUtil;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	@DataProvider
	public static Object[][] getData() {
		
		
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

}
