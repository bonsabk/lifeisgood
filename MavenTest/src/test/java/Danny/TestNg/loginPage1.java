package Danny.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPage1 {
	WebDriver driver = null;
	@BeforeMethod
	public void launch() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bonsa\\Downloads\\geckodriver-v0.29.0-win32\\geckodriver.exe");
//		 driver = new FirefoxDriver();

         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://wordpress.com/log-in");

        
	}
 @Test 
 public void loginpage3() 
 {
	 loginPage page = new loginPage(driver);
	 page.typeUsername();
	 page.typePassword();
	  page.clickLoginpage();
 }
}
