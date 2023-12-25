package com.demoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void Test1() {
		driver.navigate().to("https://www.automationtalks.com");
		System.out.println("Page 1 title is "+driver.getTitle());
	}

	@Test
	public void Test2() {
		driver.navigate().to("https://www.automationtalks.com");
		System.out.println("Page 2 title is "+driver.getTitle());
	}

	@Test
	public void Test3() {
		driver.navigate().to("https://www.automationtalks.com");
		System.out.println("Page 3 title is "+driver.getTitle());
	}
	
	@AfterMethod
	public void quite() {
		driver.quit();
	}
}