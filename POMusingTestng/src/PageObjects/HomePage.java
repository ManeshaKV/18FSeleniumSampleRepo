package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage
{
	protected WebDriver driver; 
	public HomePage(WebDriver driver)
	{
		this.driver = driver; PageFactory.initElements(driver, this);
	}
}

