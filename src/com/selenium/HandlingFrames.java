package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement bttn = driver.findElement(By.id("Click"));
		bttn.click();
		String bttnTxt = driver.findElement(By.id("Click")).getText();
		System.out.println(bttnTxt);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement bttn2 = driver.findElement(By.id("Click1"));
		bttn2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totFrames = driver.findElements(By.tagName("iframe"));
		int tot = totFrames.size();
		System.out.println("Total frames " + tot);
				
	}

}
