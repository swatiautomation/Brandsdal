// This utility is used to read the data from the property files.
//property file under Config folder contain all configurable data

package Esko.utility;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility{                     
                                          
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
