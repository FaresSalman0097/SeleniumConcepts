package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type='file']"))
			.sendKeys("F:\\Resume\\Salman\\New format\\Resume.png");
		
		//Robot Class
		
		

	}

}
