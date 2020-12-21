package smokeSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_Annotation {
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Browser launching");
	}
@AfterTest
	public void disconnectBrowser() {
		System.out.println("Browser disconnecting");
	}
	@BeforeClass
	public void connectDB() {
		System.out.println("DB connecting");
	}
	@AfterClass
	public void disconnectDB() {
		System.out.println("DB disconnecting");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("Logout");
	}
	@Test(priority=1)
	public void bookTickets() {
		System.out.println("Book ");
	}
	@Test(priority=2)
	public void cancelTicket() {
		System.out.println("Cancel ");
	}
}
