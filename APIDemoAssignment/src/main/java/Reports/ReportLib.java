package Reports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportLib 
{
	ExtentHtmlReporter htmlReport ;
	protected ExtentReports extent;

	@BeforeSuite	
	public void reportSetUp()
	{
		htmlReport = new ExtentHtmlReporter("Report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
	}

	@AfterSuite
	public void reportClosing()
	{
		extent.flush();
	}
}
