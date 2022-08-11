package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		WebElement dwnldFle = driver.findElement(By.
				xpath("//*[text()='Download Excel']"));
		dwnldFle.click();
		Thread.sleep(3000);
		File dwnlded = new File("F:\\Resume\\Salman\\New format");
		File[] totFiles = dwnlded.listFiles();
		for (File file : totFiles) {
			if(file.getName().equals("Resume.png")) {
				System.out.println("File Found");
				break;
			}
		}
	}
}