package testNgConcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseUtil;

public class TC005_LoginSurveyMonkeyApplication extends BaseUtil {

	BaseUtil b=new BaseUtil();
	
	By userName=By.id("username");
	By passWord=By.id("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	
	
	
	
	@Test(priority=1)
	public void invokeAppln() {
		b.launchBrowser("chrome");
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
	}
	@Test(priority=2)
	public void loginIntoApplication() {
		
		driver.findElement(userName).sendKeys("seleniumtraining1");
		driver.findElement(passWord).sendKeys("selenium1234");
		driver.findElement(loginBtn).click();
		String dashBoardText=driver.findElement(By.linkText("Dashboard")).getText();
		String expVal="Dashboard";
		/*if (dashBoardText.equalsIgnoreCase(expVal)) {
			System.out.println("Logged in successfully");
		} else {
System.out.println("Loggin is not successfull");
		}
*/		
		
		Assert.assertEquals(dashBoardText, expVal,"Loggin is not successfull");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
