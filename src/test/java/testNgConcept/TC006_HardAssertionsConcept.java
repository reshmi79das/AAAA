package testNgConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_HardAssertionsConcept {

	String course1="Maths", course2="Maths";
	int no1=10,no2=10;
	
	@Test
	public void verifyValueInAssertion() {
		
		Assert.assertEquals(course1, course2);
		Assert.assertEquals(no1, no2);
		Assert.assertTrue(false,"***********Button is missing************");
		
	}
}
