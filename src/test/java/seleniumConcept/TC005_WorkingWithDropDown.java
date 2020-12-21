package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseUtil;

public class TC005_WorkingWithDropDown extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(4000);
		//driver.findElement(By.id("month")).sendKeys("september");
		
		
		
		
		
		WebElement month=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
		WebElement year=driver.findElement(By.id("year"));
		
		b.selectValueFromDropDown(month, "Oct");
		b.selectValueFromDropDown(day, "6");
		b.selectValueFromDropDown(year, 19);
		
		String dob="6-Feb-2018";
		String spldob[]=dob.split("-");
		b.selectValueFromDropDown(day, spldob[0]);
		b.selectValueFromDropDown(month, spldob[1]);
		b.selectValueFromDropDown(year	, spldob[2]);

		
		
		
		
		
		
		
		
	/*	
		
		Select s=new Select(driver.findElement(By.id("month")));
		s.selectByIndex(6);
		s.selectByValue("10");
		s.selectByVisibleText("Dec");
		
		List<WebElement> monthName=s.getOptions();
	int mntSize=monthName.size();
	System.out.println(mntSize);
		//Thread.sleep(4000);
		for (int i = 0; i < mntSize; i++) {
			String names=monthName.get(i).getText();
			//System.out.println(names);
			
			if (names.equals("Sep")) {
				monthName.get(i).click();
			}
		}
		*/
		
		/*
		List<WebElement> m=driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println(m.size());
		for (int i = 0; i < m.size(); i++) {
			String a=m.get(i).getText();
			//System.out.println(a);
			if (a.contains("Oct")) {
				m.get(i).click();
				break;
			}
		}
		*/
		
		
		
	}

}
