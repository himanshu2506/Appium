package BusinessLogic;

import CommonLib.CommonUtils;
import PageObjectRepository.TestCaseA_PL;
import io.appium.java_client.MobileElement;

public class TestCaseA_BL
{
	CommonUtils obj=new CommonUtils();
	TestCaseA_PL call=new TestCaseA_PL();

	public boolean goToPage()
	{
		try
		{
			obj.click(call.selectAnimation());
			Thread.sleep(2000);
			obj.click(call.selectHideShowAnimation());
			Thread.sleep(2000);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean checkHide()
	{
		try
		{
			
			obj.click(call.selectHide());
			Thread.sleep(2000);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean checkNumber()
	{
		try
		{ 
			MobileElement Ze=call.selectButton1();
			MobileElement Th=call.selectButton2();
			if((Ze!=null)&&(Th!=null))
			{
				obj.click(Ze);
				Thread.sleep(2000);
				obj.click(Th);
				Thread.sleep(2000);
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean checkShow()
	{
		try
		{
			obj.click(call.selectShowHide());
			Thread.sleep(2000);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}

	}
}
