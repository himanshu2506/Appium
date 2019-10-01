package CommonLib;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import Reports.ReportLib;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Launch extends ReportLib
{
	public static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver;

	public void OpenApp() throws MalformedURLException 
	{

		DesiredCapabilities capabilties = new DesiredCapabilities();
		service=AppiumDriverLocalService.buildDefaultService();

		service.start();

		capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "xyz");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
		capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.apis.ApiDemos");
		capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.android.apis");

		URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
		driver = new AndroidDriver<MobileElement>(serverURL,capabilties);     
	}
	public void close() throws MalformedURLException
	{
        driver.quit();
		service.stop();

	}
}
