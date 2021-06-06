package com.selenium.seleniumdocker;


import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	@Test
	public void firstTest() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://13.229.107.225:8383");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("About Us")).click();

		String test = driver.findElement(By.id("PID-ab2-pg")).getText();
		Assert.assertEquals(test,
				"This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println("Test Succeeded!!");
		driver.quit();

	}

}
