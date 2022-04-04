package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ashutoshsingh/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com//");
		driver.manage().window().maximize();
		List<WebElement> alltags = driver.findElements(By.tagName("a"));

		System.out.println("Total tags " + alltags.size());

		for (int i = 0; i < alltags.size(); i++) {
			System.out.println("Links on page are " + alltags.get(i).getAttribute("href"));
			System.out.println("Links on page are " + alltags.get(i).getText());
		}

	}
}