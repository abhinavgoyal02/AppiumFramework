package base;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenBase {

	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;

	public ScreenBase(AppiumDriver<MobileElement> driver) {
		
		this.driver = driver;
		
	}

	public void waitforElement(long duration, String locator) {

		wait = new WebDriverWait(driver, duration);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));

	}

	public void hideKeyboard() {

		driver.hideKeyboard();
		
	}
}
