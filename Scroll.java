package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.bell.ca/");
               
		   //scrollings
	       ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

	       Actions ac = new Actions(driver);

			WebElement Mobility= driver.findElement(By.xpath("//*[@id=\"Mob_LOB\"]"));     
			ac.moveToElement(Mobility).build().perform();

			Thread.sleep(3000);
			WebElement Business= driver.findElement(By.xpath("//*[@id=\"Bus_LOB\"]")); 
			Business.click();

			Thread.sleep(2000);
		

	}

}
