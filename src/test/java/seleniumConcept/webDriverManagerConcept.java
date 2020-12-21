package seleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BaseUtil;

public class webDriverManagerConcept extends BaseUtil {

	public static void main(String[] args) {
		
		BaseUtil bu=new BaseUtil();
		bu.launchBrowser("chrome");
		driver.get("http://www.google.ca");
		System.out.println(driver.getTitle());
		
		
		
		
		
		

		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver1=new ChromeDriver();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2=new ChromeDriver();*/

		
		
		
		
		
	}

}
