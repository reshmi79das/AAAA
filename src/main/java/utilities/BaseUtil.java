package utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
public static WebDriver driver;


/**
 * This method is used to open the browser based on argument passed
 * @param browserName
 * @return
 * @Usage-launchBrowser("Chrome")
 * @param-chrome/ie/firefox
 */
	public WebDriver launchBrowser(String browserName) {
		
		//opens the browser based on argument passed
		if (browserName.equalsIgnoreCase("chrome")) {//opening chrome
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("IE")){//opening ie
			DesiredCapabilities ch=DesiredCapabilities.internetExplorer();
			//ch.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);//process before opening in private
			//ch.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");   //for opening in private mode
			ch.setCapability("ignoreZoomSetting", true);//For ignoring zoom setting
			ch.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);//protected mode anable
		
			
			WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver(ch);

		}else if(browserName.equalsIgnoreCase("firefox")) {//opening firefox
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();

		}else {
			System.out.println("Browser is not found");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();//maximising the application
		return driver;//return driver out of this method
		
	}
	
	public void selectValueFromDropDown(WebElement elemDetails,String value) {
		Select s=new Select(elemDetails);
		s.selectByVisibleText(value);
		
	}
public void selectValueFromDropDown(WebElement elemDetails,int value) {
	Select s=new Select(elemDetails);
	s.selectByIndex(value);
	} 

public static void captureScreenShotsForPage(WebDriver driver,String fileName) throws IOException {
	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(sc, new File("./target/Screenshot/"+fileName+".png"));

	} catch (IOException ioe) {
		ioe.printStackTrace();
	}
	
}
public static void captureScreenShotsOnElement(WebElement element,String fileName) throws IOException {
	File sc=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(sc, new File("./target/Screenshot/"+fileName+".png"));

	} catch (IOException ioe) {
		ioe.printStackTrace();
	}
	

}

public static boolean verifyForElementPresent(String eleXPath) {
	WebDriverWait wait=new WebDriverWait(driver, 20);
try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eleXPath)));//username is visible

} catch (Exception e) {
e.printStackTrace();
return false;



}
	
	return true;
	
	
}
	
	
	
	
	
}
