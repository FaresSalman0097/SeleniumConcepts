package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		
		WebElement autoSlct1 = driver.findElement(By.id("tags"));
		autoSlct1.sendKeys("s");
		Thread.sleep(5000);
		List<WebElement>   options = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		for (WebElement webElement : options) {
			if(webElement.getText().equals("SOAP")) {
				System.out.println(webElement.getText());
				Thread.sleep(2000);
				webElement.click();				
				break;				
			}
	}
		driver.quit();
	}

}
