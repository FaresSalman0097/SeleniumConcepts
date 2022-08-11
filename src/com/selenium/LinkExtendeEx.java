package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendeEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		WebElement hmePage = driver.findElement(By.linkText("Go to Home Page"));
		hmePage.click();

		driver.navigate().back();
		// GetAttribute
		WebElement whchPge = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String landingPage = whchPge.getAttribute("href");
		// bkrnLink
		WebElement brknLnk = driver.findElement(By.linkText("Verify am I broken?"));
		brknLnk.click();
		String brknLnkTitle = driver.getTitle();
		if (brknLnkTitle.contains("404")) {
			System.out.println("The link is broken");
		} else {
			System.out.println("The link is not broken");
		}

		driver.navigate().back();

		// same link name
		// at this stage staleelmentreferenceexception occurs as the page has been
		// redirected or refreshed
		// in this case we need to again find the webelement
		// hmePage.click(); - this wont work
		WebElement hmePage1 = driver.findElement(By.linkText("Go to Home Page"));
		hmePage1.click();

		driver.navigate().back();

		// how many links?

		List<WebElement> toLink = driver.findElements(By.tagName("a"));

		int tot = toLink.size();
		System.out.println("total links " + tot);

	}
}
