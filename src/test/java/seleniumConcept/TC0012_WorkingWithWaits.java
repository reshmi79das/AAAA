package seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseUtil;

public class TC0012_WorkingWithWaits extends BaseUtil {

	public static void main(String[] args) {

		BaseUtil b=new  BaseUtil();
		b.launchBrowser("chrome");
		
		driver.get("https://www.awwwards.com/sites/khoa-le");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Register / log in')]")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='_username']")));//username is visible
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='_username']")));//username is present on the page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=submit]")));//until login button is enabled
*/		
		
		if (verifyForElementPresent("//input[@name='_username']")) {
			driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("Reshmi");

		}
		
		//driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("Reshmi");
		
	}

	
	
}
