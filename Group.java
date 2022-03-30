package ducat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Group {
    
    WebDriver driver ;
    
    @Test(groups = { "true" })
    public void starting_point(){
    System.out.println("This is the starting point of the test");
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
       String baseUrl = "https://www.google.com/";
       System.out.println("Launching Google Chrome browser");
       driver = new ChromeDriver();
       driver.get(baseUrl);
    }
    
    
    @Test(groups = { "demo" })    
    public void checkTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
           driver = new ChromeDriver();
           driver.get("https://www.google.com/");
               
       String testTitle = "Google";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }    
    
    @Test(groups = { "demo" })    
    public void click_element() {    
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        System.out.println("Click is displayed");    
    }
}
