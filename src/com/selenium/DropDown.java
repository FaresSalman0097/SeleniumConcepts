package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//select by index
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select selct1 = new Select(dropDown1);
		selct1.selectByIndex(2);
	
		
		//selet by text
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select selct2 = new Select(dropDown2);
		selct2.selectByVisibleText("Selenium");
		
		//select by value
		selct2.selectByValue("3");
		
		//get the number of dropdown options
		List <WebElement> listOptions =selct2.getOptions();
		
		int size= listOptions.size();
		System.out.println(size);
		
		//selecting using senKeys
		dropDown1.sendKeys("Selenium");
		
		//Multiselect box
		WebElement multislct = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select slct3 = new Select(multislct);
		slct3.selectByIndex(1);
		//slct3.selectByIndex(2);
		slct3.selectByIndex(3);
		
	}

}
