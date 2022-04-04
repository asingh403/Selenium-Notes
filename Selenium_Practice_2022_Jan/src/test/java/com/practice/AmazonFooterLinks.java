package com.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// driver.manage().window().fullscreen();

		List<WebElement> footerLinksURL = driver
				.findElements(
						By.xpath(
								"//div[@class = 'navFooterLinkCol navAccessibility']/ul//a"));

		Map<String, String> map = new HashMap<>();

		for (WebElement e : footerLinksURL) {
			String totalLinksWithText = e.getText() + " : " + e.getAttribute("href");

			String[] st = totalLinksWithText.split(" : ");

			for (int i = 0; i < st.length; i += 2) {
				map.put(st[i], st[i + 1]);
			}

			// System.out.println(map);

		}

		// ** MAP Handling

		for (String s : map.keySet()) {
			System.out.println(s + " -> " + map.keySet());
		}

		driver.quit();

	}
}
