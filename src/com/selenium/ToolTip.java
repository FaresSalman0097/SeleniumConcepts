package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		
		WebElement toolTip= driver.findElement(By.id("age"));
		String toolTipTxt = toolTip.getAttribute("title");
		System.out.println(toolTipTxt);
	}

}
