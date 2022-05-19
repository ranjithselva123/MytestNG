package org.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	static WebDriver driver;
	
	@BeforeClass
	private void afterclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:/www.facebook.com/");
	}
	
	@Parameters({"Username"})
	@Test(priority=-2)
	private void username(@Optional("ranjith kumar") String user) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(user);
		
	}
	@Parameters({"password"})
	@Test
	private void password(@Optional("ranjith1") String pass) {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		
	}
	@AfterClass
	private void closes() {
//		driver.quit();
	}
	
	
}
