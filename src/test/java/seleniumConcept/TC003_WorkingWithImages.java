package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseUtil;

public class TC003_WorkingWithImages extends BaseUtil {

	public static void main(String[] args) {
		
		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		
		driver.get("https://www.ebay.com/");
		List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println(images.size());
		
		for (int i = 0; i < images.size(); i++) {
			String imgUrl=images.get(i).getAttribute("src");
			System.out.println(imgUrl);
		}
		

	}

}
