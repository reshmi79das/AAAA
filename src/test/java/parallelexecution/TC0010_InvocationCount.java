package parallelexecution;

import org.testng.annotations.Test;

public class TC0010_InvocationCount {
	
	@Test(invocationCount=10)//to enter 10 differ username n passw into the DB
	public void login() {
		System.out.println("Login test");
	}

}
