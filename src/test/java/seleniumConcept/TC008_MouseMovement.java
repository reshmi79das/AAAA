package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseUtil;

public class TC008_MouseMovement extends BaseUtil{

	public static void main(String[] args) throws InterruptedException {
BaseUtil b=new BaseUtil();
b.launchBrowser("chrome");
driver.get("https://www.amazon.in/");
		Actions a=new  Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		List<WebElement> lists=driver.findElements(By.xpath("//*[@id=\'nav-al-your-account\']/a"));
		for (int i = 0; i < lists.size(); i++) {
			String listName=lists.get(i).getText();
			System.out.println(listName);
		}
		
		
		
		
		
		
		/*driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		Actions a=new  Actions(driver);
		Thread.sleep(3000);
a.moveToElement(driver.findElement(By.id("username"))).sendKeys("seleniumtraining1").build().perform();
		a.sendKeys(driver.findElement(By.id("password")), "selenium1234").build().perform();
		a.click(driver.findElement(By.xpath("//button[@type='submit']"))).build().perform();*/
		
		
		
	}

}
