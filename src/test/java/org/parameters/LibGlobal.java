package org.parameters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver  driver;
	
	public void getDriver(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("gecko")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}
		public void launchurl(String url) {
			driver.get(url);
		}
	
	public WebElement findElementById(String value) {
		WebElement txt = driver.findElement(By.id(value));
		return txt;
	}
	public void insertSendKeyValue(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}
	public void clickbutton(WebElement btn) {
		btn.click();
	}
	public void exit() {
		driver.quit();
	}
	public void excelread() {
		
	}
	public Select dropdown3(WebElement ele,String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
		return select;
	}
	


}

