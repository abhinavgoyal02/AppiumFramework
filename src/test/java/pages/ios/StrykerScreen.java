package pages.ios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class StrykerScreen extends ScreenBase{

	public StrykerScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public void swipeMainScreenandReachLandingPage(){
		
		driver.swipe(286, 200, 10, 200, 2000); 
	    
	    driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
	
		    
			  
		
	}
	
	public void drawLine() throws InterruptedException{
		
		  driver.findElement(By.name("tab-01.png")).click();
		    Thread.sleep(3000);
		    driver.executeScript("UIATarget.localTarget().dragFromToForDuration({x:83.00, y:429.67}, {x:329.67, y:331.67}, 1.6);");
			
		
		
	}
	

	public void expandBox() throws InterruptedException {
		
		Thread.sleep(4000);
		System.out.println("Inside Expand Box test");
		 driver.findElement(By.name("tab-02.png")).click();
			
		    Thread.sleep(3000);
		    driver.executeScript("UIATarget.localTarget().dragFromToForDuration({x:256.00, y:449.67}, {x:356.67, y:347.00}, 0.9);");
		    
		
		
	}
	
	
	public void typeText() throws InterruptedException{
		
		  driver.findElement(By.name("Write.png")).click();
		    
		  new Actions(driver).sendKeys("Testing").perform();
			  Thread.sleep(3000);
			 driver.findElement(By.name("Write.png")).click();

		
		
		
	}
	
	
}
