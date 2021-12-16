package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class App 
{
	public WebDriver driver;
   @BeforeTest
   public void init()
   {
	   String browserPath=System.getProperty("user.dir")+"//src//main//java//resources//chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver",browserPath);
	   driver= new ChromeDriver();
   }
   
   @Test
   public void test()
   {
	   driver.get("https://www.google.com/");
   }
}
