package ducat;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  
		 WebDriver driver= new ChromeDriver();

		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		  
		  org.openqa.selenium.Point location = element.getLocation();
		  int x = (int) location.getX();
		  int y = (int) location.getY();
		  System.out.println("Coordinates of an element is : " + x + " and " + y);
	}

	}


