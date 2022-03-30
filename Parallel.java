package ducat;

import org.testng.annotations.Test;

public class Parallel {

	public class Parallel {
	    
	    public WebDriver driver;
	    @Test
	    public void FirefoxTest() {    
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();      
	    driver.get("https://google.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	    driver.quit();
	     }

	    @Test
	    public void ChromeTest()
	    {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://fb.com");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
	    }
	}