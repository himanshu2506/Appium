package Reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{
	
	public void onTestStart(ITestResult result) 
	{
        System.out.println("Test Method Started :" + result.getName());
    }
 
    public void onTestSuccess(ITestResult result) 
    {
        System.out.println("Test Method Passed :" + result.getName());
    }
    
    public void onTestFailure(ITestResult result) 
	{
		try 
		{
			ScreenshotLib.capture(result.getName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	} 
    
    public void onTestSkipped(ITestResult result) 
    {
        System.out.println("Test Method Skipped :" + result.getName());
    }
 
    
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
    {
        
    }
 
    public void onStart(ITestContext context)
    {
        System.out.println("Test on Start :" + context.getName());
    }
 
    public void onFinish(ITestContext context) 
    {
        System.out.println("Test on Finish :" + context.getName());
    }
}
