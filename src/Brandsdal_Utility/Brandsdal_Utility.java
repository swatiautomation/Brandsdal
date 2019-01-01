package Brandsdal_Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Brandsdal_Utility 
{
	public static Object fetchpropertyvalue(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	  
	}


	public static String fetchlocatorvalue(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./Config/Elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	  
	}

}