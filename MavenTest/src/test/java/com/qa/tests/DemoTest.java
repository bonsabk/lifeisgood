package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test // this is will execute test cases
	
	public void Sum() {
		System.out.println("sum");
		int a = 20;
		int b = 10;
	Assert.assertEquals(30, a+b);
		}
	@Test// this will execute test cases
	public void multi() {
		System.out.println("multi");
		int a = 20;
		int b = 10;
	Assert.assertEquals(200, a*b);
	}
	
	
	@ Test // this is will execute teste Cases
	
	public void sub() {
		System.out.println("sub");
		int a = 20;
		int b = 10;
	Assert.assertEquals(10, a-b);
	System.out.println("Qa is fun");
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
