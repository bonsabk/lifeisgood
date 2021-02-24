package com.qa.tests;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EndToGrayhound {
   
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 String month = " June 2021";
		 String date  = "20";
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		     driver.get("https://www.greyhound.com/");
		                    //Depart
	     driver.findElement(By.xpath("//input[contains(@id,'fromLocation')]")).sendKeys("silver spring,MD");
		     //driver.findElement(By.xpath("//input[contains(@id,'fromLocation')]")).sendKeys(Keys.ARROW_DOWN);
		    // driver.findElement(By.xpath("//input[contains(@id,'fromLocation')]")).sendKeys(Keys.ARROW_DOWN);
		     driver.findElement(By.xpath("//input[contains(@id,'fromLocation')]")).sendKeys(Keys.ENTER);
		    Thread.sleep(4000);
		                    //Arrive Date 
		    driver.findElement(By.xpath("//input[contains(@id,'toLocation')]")).sendKeys(" New york,Ny");
		    driver.findElement(By.xpath("//input[contains(@id,'toLocation')]")).sendKeys(Keys.ENTER);
		    Thread.sleep(4000);
		    
		                 //Depart Date 
		     
		     WebElement dateBox = driver.findElement(By.xpath("//input[contains(@id,'datepicker-from')]"));

		      //Fill date as mm/dd/yyyy as 09/25/2013

		     dateBox.sendKeys("02/30 /2021");
		   //Press tab to shift focus to time field

		      dateBox.sendKeys(Keys.TAB);
           Thread.sleep(4000);
		        //Fill time as 02:45 PM
	       //dateBox.sendKeys("04:40 pm");4
		            // Arrive date 
		     WebElement dateBox1 = driver.findElement(By.xpath("//input[contains(@class,'form-control dp hasDatepicker')]"));
		        dateBox1.sendKeys("03/20/2021");
		        dateBox1.sendKeys(Keys.TAB);
		        //dateBox1.sendKeys("");
		       Thread.sleep(4000);
		        //driver.findElement(By.xpath("(//a[contains(@role,'button')])[3]")).click();
		       driver.findElement(By.xpath("//a[@aria-controls='passenger-panel']")).click();
				int i=1;
				while(i<3) {		
				driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
				i++;
				}
				Thread.sleep(3000);
				int j=0;
				while(j<2) {		
				driver.findElement(By.xpath("(//span[@class='icon icn-020pluswhite-lrg'])[3]")).click();
				j++;
				
				}	
				
				Thread.sleep(3000);
				int k=0;
				while(k<2) {		
				driver.findElement(By.xpath("(//button[@class='btn-ctrl plus'])[5]")).click();
				k++;		
				}
		        
				
		        driver.findElement(By.xpath("//span[@id='ff-travel-discountoptions-button']")).sendKeys("Student Advantage ");
		        driver.findElement(By.xpath("//span[@id='ff-travel-discountoptions-button']")).sendKeys(Keys.ARROW_DOWN);
		        driver.findElement(By.xpath("//span[@id='ff-travel-discountoptions-button']")).sendKeys(Keys.ENTER);
		        Thread.sleep(4000);
		        //driver.findElement(By.xpath("//input[contains(@id,'ff-travel-promocode')]")).sendKeys("123456");
		        driver.findElement(By.xpath("//input[contains(@id,'fare-search-btn')]")).click();
		        

		        
		        
		        
		        

	
			 
	    
		     
			 
	}
}

		     
		     
		 
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	


