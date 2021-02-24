package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newcalenderhading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String month = "march 2021";
	        String Day = "20";
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			 driver.get("https://www.busbud.com/");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				Select s = new Select (driver.findElement(By.id("roundtrip-toggler")));
//				s.selectByVisibleText("Round trip");
//				driver.findElement(By.id("origin-c1ty-input")).click();
//				driver.findElement(By.xpath("//input[@value='Washington']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.id("destination-c1ty-input")).click();
//				driver.findElement(By.xpath("//input[@value='New York']")).sendKeys("New York");
			 
			 
//				Thread.sleep(4000);
				   // Departure Date 
				driver.findElement(By.xpath("//input[@id='outbound-date-input']")).click();
				Thread.sleep(3000);
				while (true)
				{
			String text= driver.findElement(By.xpath("(//div[@class='month'][contains(.,'January 2021')])[1]")).getText();
				if 
				(text.equals(month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"outbound-calendar-dropdown\"]/div/div[1]/div[2]/svg")).click();
				}
				
				}
				
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div/div[contains(text(),'30')]")).click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//driver.findElement(By.xpath("(//div[contains(@class,'calendar calendar-0')])[1]")).click();
			    //driver.findElement(By.xpath("(//div[@class='cell day day_of_week_6'][contains(.,'30')])[1]")).click();
		
			
			   // Arrival Date
		   // driver.findElement(By.xpath("//input[@id='return-date-input']")).click();
		   // driver.findElement(By.xpath("(//div[contains(@class,'calendar calendar-0')])[2]")).click();
		  //  driver.findElement(By.xpath("(//div[contains(@class,'cell day day_of_week_7')])[31]")).click();
			       //passenger 
		   // driver.findElement(By.xpath("//input[@id='passenger-input']")).click();
			    // driver.findElement(By.xpath("//div[@class='passenger-dropdown-section'][contains(.,'Adults1Children1Seniors1')]")).click();
			     
			  // driver.findElement(By.xpath("//div[@class='passenger-count-container clearfix'][contains(.,'Adults1')]")).click();
			  
			    //driver.findElement(By.xpath("(//div[contains(@class,'passenger-count-container clearfix')])[2]"));
			   
			  // Select see3 = new Select (driver.findElement(By.xpath("//div[@class='passenger-count-container clearfix'][contains(.,'Seniors0')]")));
			  // see3.selectByVisibleText("2");
			   
        
       
				
		
		
		
		
	}

}
