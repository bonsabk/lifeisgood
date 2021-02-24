package Danny.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTc {
	WebDriver driver = null;
	@BeforeMethod
	public void launch() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");

         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://shop.icraftsoft.net:8095/?");
	}
 @Test 
 public void Search() throws InterruptedException {
	 Thread.sleep(6000);
	 POM p = new POM(driver);
	 //p.Register();
	 p.Login();
	 p.Add_cart();
	 driver.navigate().back();
	System.out.println("Your Order has been placed! Your orderid is: 1664 Shop again with us!");

	  }
 public void close() {
	 driver.close();
 }
 
}
