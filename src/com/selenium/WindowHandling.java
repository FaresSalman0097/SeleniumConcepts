package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/");
		
		WebElement window = driver.findElement(By.xpath("//*[@alt='Windows']/parent::*"));
		window.click();
		
		String oldWindow = driver.getWindowHandle();
		System.out.println(oldWindow);
		
		WebElement hmepgeBttn = driver.findElement(By.id("home"));
		hmepgeBttn.click();
		Set<String> opnWindows = driver.getWindowHandles();
		System.out.println(opnWindows);
		
		for (String newWindow : opnWindows) {
			driver.switchTo().window(newWindow);
		}
		
		driver.manage().window().maximize();
		
		WebElement editBttn = driver.findElement(By.xpath("//*[@alt='Edit / Text Fields']/parent::*"));
		editBttn.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement mltpleWindowsBttn = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		mltpleWindowsBttn.click();
		
		int mltplewndwSize = driver.getWindowHandles().size();
		System.out.println("total opened windows "+mltplewndwSize);
		
		Set<String> clseChldWndw = driver.getWindowHandles();
		for (String allWindows : clseChldWndw) {
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}			
		}
		
	driver.quit();	
		
	}

}
