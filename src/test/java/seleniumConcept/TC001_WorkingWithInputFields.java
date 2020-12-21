package seleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseUtil;

public class TC001_WorkingWithInputFields extends BaseUtil {

	public static void main(String[] args) {
String expVal="Log in with SSO";
boolean status=false;

		BaseUtil bu=new BaseUtil();
		bu.launchBrowser("chrome");
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
	boolean signUpText=	driver.findElement(By.linkText("Sign Up")).isDisplayed();
		System.out.println(signUpText);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int lnkNo=links.size();
		System.out.println(lnkNo);
		for (int i = 0; i < links.size(); i++) {
			String lnkName=links.get(i).getText();
			//System.out.println(lnkName);
			if (!(lnkName.isEmpty())) {
				//System.out.println(lnkName);
			}
			if (lnkName.equalsIgnoreCase(expVal)) {
				status=true;
				break;
			} else {
           status=false;
          
			}
		
		
			
		}
		
		if (status==true) {
			System.out.println("pass");
		} else {
System.out.println("fail");
		}
		
		
	WebElement userName=	driver.findElement(By.id("username"));
		
		userName.sendKeys("seleniumtraining1");
	String inputVal=userName
			.getAttribute("value");
	System.out.println(inputVal);
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
