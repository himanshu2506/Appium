package BusinessLogic;

import CommonLib.CommonUtils;
import PageObjectRepository.TestCaseB_PL;
import io.appium.java_client.MobileElement;

public class TestCaseB_BL
{
	CommonUtils obj_1=new CommonUtils();
	TestCaseB_PL call_1=new TestCaseB_PL();

	public boolean App()
	{
		try
		{
			obj_1.click(call_1.selectApp());
			Thread.sleep(2000);
			obj_1.click(call_1.selectActionBar());
			Thread.sleep(2000);
			obj_1.click(call_1.selectDisplayOptions());
			Thread.sleep(2000);
			obj_1.click(call_1.selectDisplay_Show_Title());
			Thread.sleep(2000);
			MobileElement ti=call_1.selectView();
			if(ti==null)
			{
				obj_1.click(call_1.selectDisplay_Show_Title());
				Thread.sleep(2000);
			}
			MobileElement title_element=call_1.selectView();
			String title=title_element.getText();

			if((title)!=null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
			return false;
		}
	}

}
