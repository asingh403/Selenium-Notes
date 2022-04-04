package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintFooterLinkDemoCart {
	static WebDriver driver;

	public static void linkTextAndLinkPrint(String URL, String value) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		// driver.manage().window().fullscreen();

		By locators = By.xpath(value);

		List<WebElement> footerLinksURL = driver.findElements(locators);

		for (WebElement e : footerLinksURL) {
			System.out.println(e.getText()+" : "+e.getAttribute("href"));
		}

		driver.quit();

	}

	public static void main(String[] args) {

//		String demo_url = "https://demo.opencart.com/index.php?route=account/login";
//		String demo_xpath_value = "//ul[@class = 'list-unstyled']/li/a";
//
//		linkTextAndLinkPrint(demo_url, demo_xpath_value);
		
		
		String freshWork_url = "https://www.freshworks.com/";
		String fresh_xpath_value = "//ul[contains(@class, 'social-connect-nav')]/li/a";
		
		linkTextAndLinkPrint(freshWork_url, fresh_xpath_value);

	}

}
