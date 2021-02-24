package Danny.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class POM {
	WebDriver driver= null;
//	By searchpro = By.xpath("//input[@type='search']");
//    By Addcart = By.xpath("(//button[contains(.,'Add to cart')])[5]");
//    By Addcart1 = By.xpath("//a[@href='/cart'][contains(.,'Cart  (1)')]");
//    By buynow = By.id("btn2");
//    By lognin1 =By.name("userid");
//    By loggin2 = By.xpath("btnSubmit");
  
	
	
	//parametrized constructor
	 public POM(WebDriver driver) {
		 
		this.driver =driver;
	}
	
		  
	 public void Add_cart() throws InterruptedException {
//		 driver.findElement(searchpro).sendKeys(" Dell ");
//		 driver.findElement(searchpro).sendKeys(Keys.ENTER);
//		 driver.findElement(Addcart).click();
//		 driver.findElement(Addcart1).click();
//		 driver.findElement(buynow).click();
		 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement Qlt =driver.findElement(By.xpath("//input[@type='search']"));
				Qlt.sendKeys("Dell");
				Qlt.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("(//button[contains(.,'Add to cart')])[2]")).click();
	    
	    int i =0;
	    while(i<4) {
	     driver.findElement(By.xpath("//a[contains(.,'Cart  (1)')]")).click();
		i++;
	    }
		
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(4000);
		driver.close();
		 
		 Thread.sleep(4000);
		
	 }
	 public void Register() throws InterruptedException {
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		 driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("bons2020");
		 driver.findElement(By.name("email")).sendKeys("bon20@gmail.com");
		 driver.findElement(By.xpath("//input[@class='btnSubmit']")).click();//1976 unique Id
		
	 }
	 public void Login() throws InterruptedException {
		 Thread.sleep(4000);
		 driver.findElement(By.name("userid")).sendKeys("1980");
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		 
	 }
	
  

}
