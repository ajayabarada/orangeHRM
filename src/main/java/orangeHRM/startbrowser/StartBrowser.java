package orangeHRM.startbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangeHRM.propertyRead.ReadPropertyFile;

public class StartBrowser {
	
	public static WebDriver driver;
	
	public static void startbrowser()
	{
		if(ReadPropertyFile.propertyfile("Browser_name").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay Barad\\Automation\\OrangeHRM\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(ReadPropertyFile.propertyfile("Application_URL").toString());
		driver.manage().window().maximize();
	}

}
