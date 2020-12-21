package seleniumConcept;

import org.openqa.selenium.By;

import utilities.BaseUtil;

public class TC0013_CSSSelector extends BaseUtil{

	//in css id will be replaced by #
	//space will be replaced by . and there will be special character
	public static void main(String[] args) {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		
	          /*  input#password      this are all eg of css selector
	           input[id=password]
		       input[name=password]
				._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy*/
		
		
	}

}
