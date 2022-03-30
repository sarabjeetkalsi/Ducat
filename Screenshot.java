package ducat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	   WebDriver driver ;
	    
	    @Test
	  public void f()
	  {    
	      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      //Take the screenshot
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      
	      //Copy the file to a location and use try catch block to handle exception
	      try {
	          FileUtils.copyFile(screenshot, new File("C:\\dell\\DJScreenshot.png"));
	      } catch (IOException e) {
	          System.out.println(e.getMessage());
	      }
	      
	      //closing
	      driver.close();
	  }
}