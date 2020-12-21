package seleniumConcept;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

//import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BaseUtil;

public class TC0011_WorkingWithIE extends BaseUtil{

	public static void main(String[] args) throws InterruptedException {

		BaseUtil b=new  BaseUtil();
		b.launchBrowser("IE");
		
		
		/*DesiredCapabilities c=DesiredCapabilities.internetExplorer();
		c.setCapability("ignoreZoomSetting", true);
				
		WebDriverManager.iedriver().setup();
		
WebDriver driver=new InternetExplorerDriver(c);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		*/
		
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		System.out.println("Application title is :"+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		System.out.println("Application Url is :"+driver.getCurrentUrl());
		
		
	}

}
