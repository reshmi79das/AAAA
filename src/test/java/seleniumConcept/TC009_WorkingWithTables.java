package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseUtil;

public class TC009_WorkingWithTables extends BaseUtil{

	public static void main(String[] args) {
		
		String expLastName="Grace";
		boolean status=true;
		
        BaseUtil b=new  BaseUtil();
        b.launchBrowser("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td[4]/a"));
		//List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[4]"));
		
		System.out.println("Total number of rows in a column "+ rows.size());
		
		for (int i = 0; i <rows.size(); i++) {
			String rowsName=rows.get(i).getText();
			//System.out.println(rowsName);
			if (rowsName.equalsIgnoreCase(expLastName)) {
				status=true;
				break;
			} else {
            status=false;
			}
			
				}
		
		if (status==true) {
			System.out.println("Lastname is-"+"'"+expLastName+"'"+"Exists");
		} else {
System.out.println("lastname is- "+"'"+expLastName+"'"+"is missing");
		}
		
		
		
	}

}
