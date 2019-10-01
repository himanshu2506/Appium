package CommonLib;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;


public class XMLLib 
{
	public static String Reader(String key) throws DocumentException
	{
		String xmlPath = LoadProperty.getVar("Locators.xml");
		SAXReader saxReader = new SAXReader();
		Document document = (Document) saxReader.read(xmlPath);
		String value=document.selectSingleNode("//root/Locator/"+key).getText();
		return value;
	} 
}
