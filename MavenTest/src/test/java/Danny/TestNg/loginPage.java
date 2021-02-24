package Danny.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
   By user = By.xpath("//input[contains(@id,'usernameOrEmail')]");
   By pass =By.id("password");
   By login = By.xpath("//button[contains(.,'Log In')]");
  
   public loginPage (WebDriver driver) 
   {
	   this.driver= driver;
   }
public void typeUsername()
{
	driver.findElement( user).sendKeys("bonsa2021");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
public void typePassword()
{
	driver.findElement(pass).sendKeys("Tariku2112");
	
}
public void clickLoginpage()
{
	driver.findElement(login).click();
}

}
