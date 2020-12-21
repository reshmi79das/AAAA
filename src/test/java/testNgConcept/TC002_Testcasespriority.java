package testNgConcept;

import org.testng.annotations.Test;

public class TC002_Testcasespriority {

	@Test(priority=1)
	public void login() {
		System.out.println("Login into application");
	}
	@Test(priority=3)
	public void logOut() {
		System.out.println("Logout fromapplication");
	}
	@Test(priority=2)
	public void bookingTickets() {
		System.out.println("Booking tickets");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
