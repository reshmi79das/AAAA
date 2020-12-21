package smokeSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_dependsOnMethod {
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login into application");
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods="login")
	public void logOut() {
		System.out.println("Logout fromapplication");
	}
	@Test(priority=2)
	public void bookingTickets() {
		System.out.println("Booking tickets");
	}
	

}
