package ducat;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Intro {
	
WebDriver driver ;
    
    @Test
  public void f()                           
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
      String baseUrl = "https://www.google.com/";
      System.out.println("Launching Google Chrome browser");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String testTitle = "Free Internet For Everyone";
      String originalTitle = driver.getTitle();
      AssertJUnit.assertEquals(originalTitle, testTitle);
      
  }
 
  @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Test On Chrome Browser");
    }
    
    @AfterMethod
    public void afterMethod() {
         driver.close();
        System.out.println("Finished Test On Chrome Browser");
    }

}
  