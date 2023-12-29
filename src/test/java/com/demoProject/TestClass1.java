package com.demoProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() throws MalformedURLException {

//		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
		
		// BrowserStack WebDriver instantiation
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");

		driver = new RemoteWebDriver(
			    new URL("https://jaykhare_Of1lML:DGPyZ3sry9h3NAGUdJ9D@hub-cloud.browserstack.com/wd/hub"),
			    caps
			);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void Test1() {
		driver.navigate().to("https://www.bstackdemo.com");
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
		//driver.close();
	}
}
