package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	
	
	
	//Create Constructor

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Create elements Actions(Clicks, Send Keys, etc....)
	protected static void click_button(WebElement button)
	{
		button.click();
		
	}
	
	protected static void Enter_Text(WebElement settxt, String Value)
	{
		settxt.clear();
		settxt.sendKeys(Value);
		
	}


}
