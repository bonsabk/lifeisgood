package Danny.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


public class icrafttest {
	WebDriver driver = null;
	@BeforeMethod
	public void launch() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");

         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://shop.icraftsoft.net:8095/?");
	}
	@Test
	 public void Register() {
		                      //signup
		 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		 driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("bons1");
		 driver.findElement(By.name("email")).sendKeys("bon1@gmail.com");
		 driver.findElement(By.xpath("//input[@class='btnSubmit']")).click();//1976 unique Id
	 }
 @Test
public void login() throws InterruptedException {
	              //login
	driver.findElement(By.name("userid")).sendKeys("1976");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Dell");
	Thread.sleep(4000);
 
            //search
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("(//button[contains(.,'Add to cart')])[2]")).click();
	driver.findElement(By.xpath("//a[contains(.,'Cart  (1)')]")).click();
	
	           //buyNow
	driver.findElement(By.id("btn2")).click();
	System.out.println("Your Order has been placed! Your orderid is: 1664 Shop again with us!");

Thread.sleep(5000);
	
	}
 
}

 
 

	