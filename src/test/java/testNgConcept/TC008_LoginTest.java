package testNgConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_LoginTest {

	WebDriver driver;
	
	By userName=By.id("username");
	By passWord=By.id("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	By signUpLink=By.linkText("SIGN UP");
	By dashBoard=By.linkText("Dashboard");
	By loginWithSSO=By.linkText("Log in with SSO");
	By forgotUsernameAndPassword=By.linkText("Forgot username or password?");
	
	@BeforeMethod
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
	}
	
	@Test(priority=4)
	public void forgotUsernameAndPasswordTest() {
		
		Assert.assertTrue(driver.findElement((forgotUsernameAndPassword)).isDisplayed());
	}
	
	@Test(priority=5 )
	public void loginWithSSOTest() {
		
		Assert.assertTrue(driver.findElement((loginWithSSO)).isDisplayed());
	}
	
	
	@Test(priority=1)
	public void signUpLinkTest() {
		
		Assert.assertTrue(driver.findElement((signUpLink)).isDisplayed());
	}
	@Test(priority=2)
	public void pageTitleTest() {
		String actAppTit=driver.getTitle();
		System.out.println("Application title is :"+actAppTit);
		Assert.assertEquals(actAppTit, "Log in to your account");
	}
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(userName).sendKeys("seleniumtraining1");
		driver.findElement(passWord).sendKeys("selenium1234");
		driver.findElement(loginBtn).click();
		String dashBoardval=driver.findElement(dashBoard).getText();
		Assert.assertEquals(dashBoardval, "Dashboard");
		//Assert.assertTrue(driver.findElement(dashBoard).isDisplayed());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
