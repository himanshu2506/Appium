package PageObjectRepository;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import CommonLib.Launch;
import CommonLib.XMLLib;
import io.appium.java_client.MobileElement;

public class TestCaseA_PL extends Launch
{

	public MobileElement selectAnimation() throws DocumentException
	{
		MobileElement Icon1=driver.findElement(By.xpath(XMLLib.Reader("Animation")));
		return Icon1;
	}

	public MobileElement selectHideShowAnimation() throws DocumentException 
	{ 
		MobileElement Icon2=driver.findElement(By.xpath(XMLLib.Reader("Hide-ShowAnimations")));
		return Icon2;	
	}

	public MobileElement selectHide() throws DocumentException 
	{
		MobileElement Icon3=driver.findElement(By.xpath(XMLLib.Reader("Hide")));
		return Icon3;	
	}

	public MobileElement selectButton1() throws DocumentException 
	{
		String path=XMLLib.Reader("Button1");
		if (path!=" ")
		{
			MobileElement Icon4=driver.findElement(By.xpath(path));
			return Icon4;
		}
		else 
		{
			return null;
		}
	}

	public MobileElement selectButton2() throws DocumentException 
	{
		String path1=XMLLib.Reader("Button2");
		if(path1!=" ") 
		{
			MobileElement Icon7=driver.findElement(By.xpath(path1));
			return Icon7;
		}
		else
		{
			return null;
		}
	}

	public MobileElement selectShowHide() throws DocumentException 
	{
		MobileElement Icon8=driver.findElement(By.xpath(XMLLib.Reader("ShowButtons")));
		return Icon8;	
	}
}
