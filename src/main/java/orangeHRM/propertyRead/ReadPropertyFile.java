package orangeHRM.propertyRead;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static String propertyfile(String key)
	{
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\Ajay Barad\\Automation\\OrangeHRM\\src\\main\\resources\\Properties\\OrangeHRM.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key).toString();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
