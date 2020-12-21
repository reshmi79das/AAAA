package regressionSuite;

import org.testng.annotations.Test;

public class TC001_DisplayMessage {
	
	@Test(priority=1,enabled=true)
	public void displayMessage() {
		System.out.println("We are learning java");
	}
@Test(priority=2,dependsOnMethods="displayMessage")
	public void displayName() {
		System.out.println("Reshmi");
	}

}
