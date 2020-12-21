package orangeHRM.Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import orangeHRM.startbrowser.StartBrowser;
import orangeHRM.utility.Utility;

public class Page extends StartBrowser {
	
	public static void username(String username)
	{
		Utility.textelement(driver.findElement(By.id("txtUsername")), username);
	}
	public static void password(String password)
	{
		Utility.textelement(driver.findElement(By.id("txtPassword")), password);
	}
	public static void loginbutton()
	{
		Utility.clickonelement(driver.findElement(By.id("btnLogin")));	
	}
	public static void loginname()
	{
		WebElement actual=driver.findElement(By.id("welcome"));
		System.out.println("actual value is:"+ actual.getText());
		assertEquals("Welcome Paul", actual.getText());
		Utility.highlightelement(actual);
	}

}
