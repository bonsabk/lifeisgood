package com.qa.tests;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSelenium {

	public static void main(String[] args) throws IOException {
	
		Date currentdate =new Date();
		System.out.println(currentdate);
	String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println( screenshotfilename);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ screenshotfilename+".png"));
		
		
	}

}
