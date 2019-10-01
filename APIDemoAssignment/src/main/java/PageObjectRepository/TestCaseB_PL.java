package PageObjectRepository;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;

import CommonLib.Launch;
import CommonLib.XMLLib;
import io.appium.java_client.MobileElement;

public class TestCaseB_PL extends Launch
{
	public MobileElement selectApp() throws DocumentException
	{
		MobileElement Icon=driver.findElement(By.xpath(XMLLib.Reader("App")));
		return Icon;
	}
	public MobileElement selectActionBar() throws DocumentException
	{
		MobileElement Icon=driver.findElement(By.xpath(XMLLib.Reader("ActionBar")));
		return Icon;
	}
	public MobileElement selectDisplayOptions() throws DocumentException
	{
		MobileElement Icon=driver.findElement(By.xpath(XMLLib.Reader("DisplayOptions")));
		return Icon;

	}
	public MobileElement selectDisplay_Show_Title() throws DocumentException
	{
		MobileElement Icon=driver.findElement(By.xpath(XMLLib.Reader("Display_Show_Title")));
		return Icon;
	}
	public MobileElement selectView() throws DocumentException
	{
		try
		{
		MobileElement Icon=driver.findElement(By.xpath(XMLLib.Reader("View")));
		return Icon;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}


	}
}
