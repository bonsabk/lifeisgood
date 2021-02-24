package com.qa.tests;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateTimePicker {

    @Test

    public void dateTimePicker(){

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.greyhound.com/");

        //Find the date time picker control

      WebElement dateBox = driver.findElement(By.xpath("//input[contains(@id,'datepicker-from')]"));

      //Fill date as mm/dd/yyyy as 02/10/2021
      dateBox.sendKeys("02/10 /2021");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

//        //Fill time as 02:45 PM
//
//       // dateBox.sendKeys("0245PM");
        WebElement dateBox1 = driver.findElement(By.xpath("//input[contains(@class,'form-control dp hasDatepicker')]"));
        dateBox1.sendKeys("06/20/2021");
        dateBox1.sendKeys(Keys.TAB);

       
       
 }

    }

