package seleniumConcept;

import org.openqa.selenium.By;

import utilities.BaseUtil;

public class TC0012_WorkingWithRadioAndCheckBox extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		driver.findElement(By.xpath("//label[text()=' Armed Forces/ Military ID card/ Dependent ID card ']")).click();
		
		
		
		
		
	}

}
