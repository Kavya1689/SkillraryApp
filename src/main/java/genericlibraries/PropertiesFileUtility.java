package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {
	Properties property;
	public void propertiesInitialization(String path)
	{
		FileInputStream fis=null;
		try {
				
			 fis =new FileInputStream(path);
			}
		catch (FileNotFoundException e){
				e.printStackTrace();
			}
		property =new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		public String fetchProperty(String key)
		{
			return property.getProperty(key);
		}	

}
	

