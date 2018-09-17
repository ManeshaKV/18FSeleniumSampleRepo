package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
		public static  WebDriver objdriver;
		@BeforeClass 
		public static void setUp()
		{
			objdriver = new ChromeDriver(); 
			objdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		}
		@AfterTest public void cleanUp()
		{ 
			objdriver.manage().deleteAllCookies(); 
		}
		@AfterClass public static void tearDown()
		{ 
			objdriver.close(); 
		}
		}
	
