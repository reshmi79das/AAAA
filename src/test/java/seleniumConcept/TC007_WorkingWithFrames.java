package seleniumConcept;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseUtil;

public class TC007_WorkingWithFrames extends BaseUtil {

	public static void main(String[] args) {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		WebElement scr=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		//String capVal=driver.findElement(By.id("draggable")).getText();
        //System.out.println(capVal);
		Actions a=new  Actions(driver);
		a.dragAndDrop(scr, trg).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Selectable")).click();
		
		
	}

}
