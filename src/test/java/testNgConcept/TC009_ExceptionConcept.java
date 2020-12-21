package testNgConcept;

import org.testng.annotations.Test;

public class TC009_ExceptionConcept {
	/*
	@Test(expectedExceptions=ArithmeticException.class)
	public void arithmaticException() {
		System.out.println("Beginning of arithmatic exception");
		
	int a=9/0;
	System.out.println("Ending of arithmatic exception");

	}

	@Test(expectedExceptions=NullPointerException.class)
	public void arithmaticException1() {
		System.out.println("Beginning of arithmatic1 exception");
		
	int a=9/0;
	System.out.println("Ending of arithmatic1 exception");

	}
	*/
	
/*
	@Test(expectedExceptions=Exception.class)  //dont know what exception it is 
	public void arithmaticException1() {
		System.out.println("Beginning of arithmatic1 exception");
		
	int a=9/0;
	System.out.println("Ending of arithmatic1 exception");

	}
	*/

	/*@Test(expectedExceptions=Throwable.class)
	public void arithmaticException1() {
		System.out.println("Beginning of arithmatic1 exception");
		
	int a=9/0;
	System.out.println("Ending of arithmatic1 exception");

	}
	*/
	

	@Test(expectedExceptions= {NullPointerException.class,ArithmeticException.class,ArrayIndexOutOfBoundsException.class})
	public void arithmaticException1() {
		System.out.println("Beginning of arithmatic1 exception");
		
	//int a=9/0;
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		a[2]=30;
	System.out.println("Ending of arithmatic1 exception");

	}
}
