package Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import CommonLib.Launch;

public class ScreenshotLib extends Launch
{
	public static String capture(String ScreenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+ "/ErrorScreenshot/" +ScreenshotName+ ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source,destination);


		return dest;	
	}
}
