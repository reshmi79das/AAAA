package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {
	
	//Define webdriver here
	WebDriver driver;
	
   //create a constructor beacaues i need to create a ref for this class
	public CommonUtils(WebDriver driver) {
		this.driver=driver;   //passing local variable to constructor class 
		
	}

	//create a generic method for all WebElements
	public WebElement getElements(By locator) {
		
		WebElement element =driver.findElement(locator);//5
		
		return element;//returning element from the method to use it in some other place
		
		
	}
	
	
	/*WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	*/
	
	
	
	
	
	public void performClick(By locator) {
		
		try {
			getElements(locator).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some exception occured while clicking on an element");

		}
	}
	
	public void enterValuesInInputFields(By locator,String values) {
		
		try {
			getElements(locator).sendKeys(values);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some exception occured while entering values in input fields");

		}
	}
	
	
	}
