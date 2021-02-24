package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTest2EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
     WebDriver driver =new ChromeDriver();
	     driver.get("https://www.spicejet.com");
   //radio button
     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
    
	     //departure and arrival dropdown
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
     driver.findElement(By.xpath("//a[@value='RDP']")).click();
    Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
     
     //calendor
   
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	    // driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover']")).click();
	     
	  
	     // passangers
	     
	     driver.findElement(By.id("divpaxinfo")).click();
	     Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	     a.selectByValue("3");
	     Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	     c.selectByIndex(1);
	     Select i = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	     i.selectByVisibleText("1");
	     
	     //currency
	     Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); 
	   //s.selectByValue("INR");
	    //s.selectByIndex(0);
	   s.selectByVisibleText("USD");
	   
	   //search button
	   
	     driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
