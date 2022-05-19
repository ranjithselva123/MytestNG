package org.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumconcept {
	
	
	@Test(dataProvider="Login")
	private void test(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys(user);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
	}
	@DataProvider(name="Login")
	private Object[][] data() {
		return new Object[][] {
			{"ran","123456789"},
			{"ranjith","123456"},
			{"ran","126789"},
			{"ranjith","3456789"}
			
		};
	
	}

}
