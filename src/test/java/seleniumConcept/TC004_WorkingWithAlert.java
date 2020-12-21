package seleniumConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utilities.BaseUtil;

public class TC004_WorkingWithAlert extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Java script alert
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
		/*
		//FileUploadAlert
		driver.get("http://the-internet.herokuapp.com/upload");
		//driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\admin\\Desktop\\FileUploadFile.txt");
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Eclipse\\eclipse\\FFFFFF.txt");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
	String capVal=driver.findElement(By.xpath("//*[contains(text(),'File Uploaded!')]")).getText();
//	System.out.println(capVal);
		if (capVal.equalsIgnoreCase("File Uploaded!")) {
			System.out.println("File is uploaded");
		} else {
System.out.println("File is not uploaded");
		}
		*/
		
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Eclipse\\eclipse\\FFFFFF.txt");
		driver.findElement(By.id("file-submit")).click();
		String capVal=driver.findElement(By.xpath("//*[contains(text(),'File Uploaded!')]")).getText();
		if (capVal.equalsIgnoreCase("File Uploaded!")) {
			System.out.println("File is uploaded");
		} else {
System.out.println("File is not uploaded");
		}
		
		
		
	}

}
