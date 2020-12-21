package orangeHRM.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import orangeHRM.startbrowser.StartBrowser;

public class Utility extends StartBrowser{
	
	public static void clickonelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void textelement(WebElement element, String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	public static void dropdownelement(WebElement element, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	public static void scrolltoelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Actions action=new Actions(driver);
		action.click(element).perform();
	}
	public static void highlightelement(WebElement element)
	{
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
	    }
	}

}
