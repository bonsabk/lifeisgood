package Danny.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest {

@Test(groups="Regression")
		public void FacebookTitleverify() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			System.out.println(driver.getTitle());
			driver.quit();
			
		}
	@Test (groups="user-registration")
	public void TitleMatch() {
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
	

	

}
