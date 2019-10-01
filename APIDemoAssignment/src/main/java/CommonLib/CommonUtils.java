package CommonLib;

import io.appium.java_client.MobileElement;

public class CommonUtils
{
	public boolean typeText(MobileElement forward,String value) 
	{
		try
		{
			if(forward != null && value != null) 
			{
				forward.clear();
				forward.sendKeys(value);
				return true;
			}
			else 
			{
				System.out.println("Null parameter found");
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean click(MobileElement go) 
	{
		if(go!=null)
		{
			go.click();
			return true;
		}
		else 
		{
			System.out.println("Null parameter found");
			return false;
		}
	}
}
