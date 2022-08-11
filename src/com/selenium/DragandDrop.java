package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//another method
		act.dragAndDrop(from, to).build().perform();
       //build().perform() maranthudatha lae
		String dropped = driver.findElement(By.id("droppable")).getText();
		System.out.println(dropped);
		
		
	}

}
