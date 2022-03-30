package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  
	    WebDriver driver= new ChromeDriver(); 
	    driver.get("http://demoqa.com/alerts");
	    driver.manage().window().maximize();

	    
//	    driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
//      Thread.sleep(5000);
//      driver.switchTo().alert().dismiss();
//        
//      Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
//	    Thread.sleep(7000);
//	    driver.switchTo().alert().dismiss();
	    
//	    driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//        Alert handle=(Alert) driver.switchTo().alert();
//        Thread.sleep(7000);
//        handle.accept();

	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

}
