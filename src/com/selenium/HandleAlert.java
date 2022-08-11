package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://leafground.com/pages/Alert.html");
			driver.manage().window().maximize();
			
			//Alert Box
			WebElement alrtBox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
			alrtBox1.click();			
			Alert alrt1 = driver.switchTo().alert();
			alrt1.accept();
			
			//Confirm box
			
			WebElement alrtBox2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));			
			alrtBox2.click();
			Alert alrt2 = driver.switchTo().alert();
			alrt2.dismiss();
			//alrt2.accept();
			//promt box
			

			WebElement alrtBox3 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));			
			alrtBox3.click();
			Alert alrt3 = driver.switchTo().alert();
			alrt3.sendKeys("fucker");
			Thread.sleep(3000);
			alrt3.accept();
	}

}
