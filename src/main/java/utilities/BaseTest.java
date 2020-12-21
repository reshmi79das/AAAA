package utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	WebDriver driver;

	public void openApplication() {
		Properties prop=new Properties();
		try {
			FileInputStream fis= new FileInputStream("./Config/Application.properties");
			prop.load(fis);
			
			String browserName=prop.getProperty("browsername");
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			} else if(browserName.equalsIgnoreCase("IE")){
                 WebDriverManager.iedriver().setup();
                 driver=new InternetExplorerDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else {
				System.out.println("No browser od your need");
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
