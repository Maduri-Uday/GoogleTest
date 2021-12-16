package Jenkins.GoogleTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
   @BeforeTest
   public void init()
   {
	   String browserPath = System.getProperty("user.dir")+"//src//main//java//resources//chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver", browserPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
}
   
   @Test
   public void test()
   {
	   driver.get("https://www.google.com/");
   }
   
   @AfterTest
   public void close()
   {
	   driver.close();
   }
}

