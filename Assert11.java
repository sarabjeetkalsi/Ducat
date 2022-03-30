package ducat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert11 {
	 WebDriver driver ;
	    
     @org.testng.annotations.AfterTest
     public void CloseBrowser()
     {
         driver.close();
         Reporter.log("Driver Closed After Testing");
     }
     
     @Test (priority = -1)
     public void OpenBrowser()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
         driver = new ChromeDriver();
         Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
         Reporter.log("Launching Google Chrome Driver version 81 for this test");
         driver.get("https://www.gmail.com");
         Reporter.log("The website used was gmail for this test", true);
         String expectedTitle = "Gmail";
         String originalTitle = driver.getTitle();
         Assert.assertEquals(originalTitle, expectedTitle);
     }



 

 @org.testng.annotations.AfterTest
 public void AfterTest()
 {
     driver.get("https://www.facebook.com");
     SoftAssert softassert = new SoftAssert();
     Reporter.log("The website used was fb for this test", true);
     String expectedTitle = "Facebook – log in or sign up";
     String originalTitle = driver.getTitle();
     softassert.assertEquals(originalTitle, expectedTitle);
   //  System.out.println("*** Checking For The Second Title ***");
     softassert.assertEquals(originalTitle, "Facebook – log in or sign up" );
     softassert.assertAll();

 }

}
