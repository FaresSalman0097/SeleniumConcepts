package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelect {

	public static void main(String[] args) {
		
		//multiselect
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		// for playing with multiselect we need select multiple elements from the list,so
		//it is recommended to take xpath
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int sizeofslct =   selectable.size();
		System.out.println(sizeofslct);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(3))
		.build().perform();
		
		//also we can use clickandhold method
		

	}

}
