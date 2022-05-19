package org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iphone {
	@Test
	private void phone() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 13");
//		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
//		searchbtn.click();
		  List<WebElement> list = driver.findElements(By.xpath("//span[text()='a-price-whole']//ancestor::a"));
		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			int pp = Integer.parseInt(text);
			if (pp>50000) {
				System.out.println(pp);
				
			}
			
		}
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
