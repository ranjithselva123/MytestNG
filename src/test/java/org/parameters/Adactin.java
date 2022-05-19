package org.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	static WebDriver driver;

	@BeforeClass
	private void before() {
		
	}

	@AfterClass
	private void after() {
//		driver.quit();
	}

	
	
	
	@Test(dataProvider = "Login")
	private void test1(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(user);
		WebElement userpass = driver.findElement(By.id("password"));
		userpass.sendKeys(pass);
		WebElement log = driver.findElement(By.id("login"));
		log.click();

	}
	@DataProvider(name="Login")
	public Object [][] data() {
		return new Object[][] {
			{"Sathish01","Sathish@01"},
			{"Ravivarma124","#Xt1068#"}
//			{},
//			{}
			
		};
		
		
		
	}

}
