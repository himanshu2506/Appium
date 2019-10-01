package CommonLib;

public class LoadProperty
{
	static String var = null;

	public static String getVar(String key)
	{
		String path = System.getProperty("user.dir");
		path = path + "/Resources/";
		if (key != null) 
		{
			path=path+"/"+key+"/";
		}
		else
		{
			System.out.println("Got null value in key, you might have provided a null value while calling getVar(String key)");
		}
		return path;
	}
}
