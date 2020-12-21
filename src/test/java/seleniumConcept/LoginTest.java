package seleniumConcept;

import org.openqa.selenium.By;

import utilities.BaseUtil;

public class LoginTest extends BaseUtil{

	public static void main(String[] args) {

		BaseUtil b=new  BaseUtil();
		b.launchBrowser("chrome");
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
		By userName=By.id("username");
		By password=By.id("password");
		By logBtn=By.xpath("//button[@type='submit']");
		
		
		
		
		
		
		CommonUtils cu=new CommonUtils(driver);//creating reference for commonutils .java
		/*cu.getElements(userName).sendKeys("seleniumtraining1");
		cu.getElements(password).sendKeys("selenium1234");
		cu.getElements(logBtn).click();*/
		
		cu.enterValuesInInputFields(userName, "seleniumtraining1");
		cu.enterValuesInInputFields(password, "selenium1234");
		cu.performClick(logBtn);
	}

}
