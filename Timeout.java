package ducat;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  
		WebDriver driver= new ChromeDriver(); 
		
		//Implicit wait
//		 Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get("http://google.com");
//			Thread.sleep(5000);
//			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("DJ2");
//			driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click(); 
		
		//Explicit wait
				driver.get("https://opensource-demo.orangehrmlive.com/");
           driver.manage().window().maximize();
           driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");		   driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		   driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		   @SuppressWarnings("deprecation")
		   WebDriverWait wait = new WebDriverWait(driver,50);
		        
		    
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]"))).click();   
		      
		 driver.findElement(By.xpath("//*[@id=\"searchDirectory_emp_name_empName\"]")).sendKeys("Jasmine Morgan");

		
		//  Example for PageLoadTimeout property
	        
//         driver.manage().timeouts().pageLoadTimeout(01, TimeUnit.SECONDS);
//         driver.get("https://www.google.com/");
         
      // Fluent wait
      
//       Wait wait1 = new FluentWait(driver)
//      .withTimeout(Duration.ofSeconds(5))
//      .pollingEvery(Duration.ofSeconds(5))
//      .ignoring(NoSuchElementException.class);
       
       // setScriptTimeout for 10 seconds
	      Timeouts setScriptTimeout = driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	     ((JavascriptExecutor) driver).executeScript("alert('hello world');");
	      Thread.sleep(5000);
	     ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
         
		
			
		

	}

}
