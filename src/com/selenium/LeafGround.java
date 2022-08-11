package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		
		//Text box operations
		//enter text
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("fakeid@gmail.com");
		//append text
		WebElement append= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		append.sendKeys("appended");
		//gettext
		WebElement getText = driver.findElement(By.name("username"));
		String textGot = getText.getAttribute("value");
		System.out.println(textGot);
		//clear text
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		//disabledbox
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		driver.navigate().back();
		//Button Operations
		// Get button position
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		WebElement bttnPosition= driver.findElement(By.id("position"));
		Point point = bttnPosition.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("The value of x: "+x);
		System.out.println("The value of y: "+y);
		
		//Button color
		WebElement color = driver.findElement(By.id("color"));
		String bttncolor=color.getCssValue("background-color");
		System.out.println(bttncolor);
		
		//Button size
		WebElement size = driver.findElement(By.id("size"));
		int ht = size.getSize().getHeight();
		int wt = size.getSize().getWidth();
		System.out.println("The height is: " + ht);
		System.out.println("The width is: " + wt);
		
		//Click button
		WebElement clickBttn = driver.findElement(By.id("home"));
		clickBttn.click();
		
		
		
	}

}
