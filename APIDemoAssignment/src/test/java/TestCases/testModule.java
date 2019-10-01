package TestCases;

import java.net.MalformedURLException;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BusinessLogic.TestCaseA_BL;
import BusinessLogic.TestCaseB_BL;
import CommonLib.Launch;


public class testModule extends Launch
{
	TestCaseA_BL first=new TestCaseA_BL();
	TestCaseB_BL second = new TestCaseB_BL();
	

	@BeforeClass
	public void open() throws MalformedURLException
	{
		OpenApp();
		
	}

	@Test(priority=1)
	public void verifyHideButton()
	{ 
		first.goToPage();
		
		ExtentTest test1 = extent.createTest("TestA", "Verify Hiding of buttons");

		AssertJUnit.assertTrue(first.checkHide());
		test1.log(Status.INFO, "Select Checkbox Hide");

		AssertJUnit.assertTrue(first.checkNumber());
		test1.log(Status.INFO, "Clicking on the numbers");

		AssertJUnit.assertFalse(first.checkNumber());
		test1.log(Status.INFO, "The number should not be clicked now as they are not visibe to the user");

	}
	@Test(priority=2)
	public void VerifyShowButton()
	{
		first.goToPage();
		ExtentTest test2 = extent.createTest("TestA", "Verify Showing of buttons");

		AssertJUnit.assertTrue(first.checkShow());
		test2.log(Status.INFO, "Click on Show Buttons");

		AssertJUnit.assertTrue(first.checkNumber());
		test2.log(Status.INFO, "Now the numbers should be clicked as they are visible to the user");
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=3)
	public void showTitle()
	{
		ExtentTest test2 = extent.createTest("TestB", "Verify Display Show title option click");

		AssertJUnit.assertTrue(second.App());
		test2.log(Status.INFO, "Verify show title button");
	}
	
	@AfterClass
	public void Appclose() throws MalformedURLException 
	{
		close();
	}
}

