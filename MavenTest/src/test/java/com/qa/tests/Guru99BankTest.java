package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99BankTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr307149");
        Thread.sleep(4000);
        driver.findElement(By.name("password")).sendKeys("amahUvy");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.xpath("//a[contains(.,'New Customer')]")).click();
        driver.findElement(By.name("name")).sendKeys("Daniel");
        driver.findElement(By.name("rad1")).click();
       WebElement box = driver.findElement(By.id("dob"));
       box.sendKeys("06/20/2000");
       box.sendKeys(Keys.TAB);
       driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("200 s Van Dorn St, Alexandria,VA 22304");
       driver.findElement(By.name("city")).sendKeys(" Alexandria");
       driver.findElement(By.name("state")).sendKeys("VA");
       driver.findElement(By.name("pinno")).sendKeys("123456");
       driver.findElement(By.name("telephoneno")).sendKeys(" 323344503");
       driver.findElement(By.name("emailid")).sendKeys("oromo@gmail.com");
       driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("amahUvy");
       driver.findElement(By.name("sub")).click();
       
	}

}
