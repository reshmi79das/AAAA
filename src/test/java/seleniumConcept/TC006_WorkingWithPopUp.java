package seleniumConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utilities.BaseUtil;

public class TC006_WorkingWithPopUp extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {

		BaseUtil b=new BaseUtil();
		b.launchBrowser("chrome");
		
		
		//Windows Popup
		/*driver.get("http://www.popuptest.com/");
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println("Total number of windows opened before clicking on links "+winIds.size());//To print the unique id for window
		
		Iterator<String> itr=winIds.iterator();
		System.out.println(itr.next());
		
		//Clicking on the multi popup link
		
		driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
		Thread.sleep(5000);
		winIds=driver.getWindowHandles();
		System.out.println("Total number of windows opened after clicking on links "+winIds.size());//To print the unique id for window

		if (winIds.size()>1) {
			itr=winIds.iterator();
			String mainWind=itr.next();
			String firstPopup=itr.next();
			String secondPopup=itr.next();
			String thirdPopup=itr.next();
			
			//driver.switchTo().window(thirdPopup);
			//driver.close();
			driver.quit();
			
			
		}
		
		

		//System.out.println(mainWind+"--"+firstPopup+"--"+secondPopup+"--"+thirdPopup);
		*/
		
		driver.get("http://www.popuptest.com/");
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		Iterator<String> itr=winIds.iterator();
		System.out.println(itr.next());
		driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
		Thread.sleep(5000);
		winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		if (winIds.size()>1) {
			itr=winIds.iterator();

			String mainWin=itr.next();
			String fstPop=itr.next();
			String sndPop=itr.next();
			String yrdPop=itr.next();
			
			driver.switchTo().window(mainWin);//for switching we need to switch to that specific window
			driver.close();
			driver.switchTo().window(fstPop);
			driver.close();
			driver.switchTo().window(sndPop);
            driver.close();

			//driver.quit();  //it will close all the window altogether

		}
		
		//System.out.println(mainWin+"--"+fstPop+"--"+sndPop+"--"+yrdPop);
		
		
		
		
		
	}

}
