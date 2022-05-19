package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	static WebDriver driver;

	@Parameters({"browser"})
	@Test
	private void test(String value) {
		if(value.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(value.equals("gecko")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Nisha@gmail.com");
		

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Nisha123456");
	}

}
