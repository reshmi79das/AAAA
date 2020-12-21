package seleniumConcept;

import org.openqa.selenium.By;

import utilities.BaseUtil;

public class TC0010_WorkingWithXpath extends BaseUtil {

	public static void main(String[] args) {

		BaseUtil b=new  BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		driver.findElement(By.xpath("//input[@id='username' and @type='text']")).sendKeys("seleniumtraining1");
		
		//notranslate required sm-input sm-input--stretch error
		//<input type="text" id="username" name="username" value="" autocorrect="off" autocapitalize="off" class="notranslate required sm-input sm-input--stretch error" maxlength="50" size="20" autofocus="">
		
		//input[contains(@class,'sm-input')]
		//tagname[contains(text(),'Log in with')]
		//tagname[@attName='AttVal' and contains(@class,'sm-input')]
		//tagname[@attName='AttVal' and contains(@class,'')]
		
	}

}
