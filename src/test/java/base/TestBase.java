package base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.ios.StrykerScreen;
import pages.ios.UICatalogScreen;
import utils.CommonUtils;
import utils.ExcelReader;

public class TestBase {

	public static AppiumDriver<MobileElement> driver;
	public static StrykerScreen str;
	public static UICatalogScreen ucs;
	public static String loadPropertyFile = "IOS_UICatalog.properties";

	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "/src/test/resources/properties/testdata.xlsx");
	// public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeClass
	public void setUp() throws IOException, InterruptedException {

		if (driver == null) {
			
			// log.debug("Appium server started");
			
			if (loadPropertyFile.startsWith("IOS")) {

				CommonUtils.loadIOSConfigProp(loadPropertyFile);
				CommonUtils.setIOSCapabilities();
				driver = CommonUtils.getIOSDriver();
				
				// log.debug("Starting on IOS");
				
			} else if (loadPropertyFile.startsWith("Android")) {

				CommonUtils.loadAndroidConfigProp(loadPropertyFile);
				CommonUtils.setAndroidCapabilities();
				driver = CommonUtils.getAndroidDriver();

				// log.debug("Starting on Android");
				
			}

		}

	}

	@AfterClass
	public void tearDown() throws IOException {

		driver.quit();

	}

}
