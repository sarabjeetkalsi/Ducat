package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  
		 WebDriver driver= new ChromeDriver();
		 Actions actions= new Actions(driver);
		 
		 //navigate the demo class
		  driver.get("https://demoqa.com/text-box");
		  
		  //enter the full name
		  WebElement fullName = driver.findElement(By.id("userName"));
		   fullName.sendKeys("Mr.star kaushik");
		   
		   //enter the email
		   WebElement email = driver.findElement(By.id("userEmail"));
		   email.sendKeys("jtoor190@gmail.com");
		   
		   // Enter the Current Address
		        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		        currentAddress.sendKeys("1808/2 Sunder Singh Marg NEAR HONDA SHOWROOM Sector 14, Old DLF Colony, Gate, Gurugram, Haryana 122001");
		        
		        // Select the Current Address using CTRL + A
		        actions.keyDown(Keys.CONTROL);
		        actions.sendKeys("a");
		        actions.keyUp(Keys.CONTROL);
		        actions.build().perform();
		        
		       // Copy the Current Address using CTRL + C
		        actions.keyDown(Keys.CONTROL);
		        actions.sendKeys("c");
		        actions.keyUp(Keys.CONTROL);
		        actions.build().perform();
		        
		       //Press the TAB Key to Switch Focus to Permanent Address
		        actions.sendKeys(Keys.TAB);
		        actions.build().perform();
		        
		        //Paste the Address in the Permanent Address field using CTRL + V
		        actions.keyDown(Keys.CONTROL);
		        actions.sendKeys("v");
		        actions.keyUp(Keys.CONTROL);
		        actions.build().perform();
		        
		        
		        
		        //Compare Text of current Address and Permanent Address
		        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));        

	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}

}
