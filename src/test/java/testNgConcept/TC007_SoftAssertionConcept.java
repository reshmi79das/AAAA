package testNgConcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC007_SoftAssertionConcept {
	
	
	String course1="Maths", course2="Maths";
	int no1=10,no2=10;
	
	@Test
	public void verifyValueInAssertion() {
		SoftAssert sa=new SoftAssert();

		sa.assertEquals(course1, course2);
		sa.assertEquals(no1, no2);
		sa.assertTrue(false,"***********Button is missing************");
		sa.assertTrue(true,"---------");
		sa.assertAll();
	}

}
