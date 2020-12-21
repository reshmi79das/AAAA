package seleniumConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import utilities.BaseUtil;

public class YTC009_WorkingWithScreenShot extends BaseUtil{

	public static void main(String[] args) throws IOException {
BaseUtil b=new BaseUtil();
b.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*File scrFil=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFil,new File("D:\\Eclipse\\Workspace\\NewMavenProject\\target\\Screenshot\\Image.png"));*/
		WebElement userName=driver.findElement(By.id("txtUsername"));
		WebElement passWord=driver.findElement(By.id("txtPassword"));
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));

		
		captureScreenShotsForPage(driver, "Login before entering the values");
		userName.sendKeys("Admin");
		captureScreenShotsOnElement(userName, "UserName field");
		passWord.sendKeys("admin123");
		captureScreenShotsOnElement(passWord, "Password  field");

		loginBtn.click();
		captureScreenShotsForPage(driver, "Login after entering the values");
driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}