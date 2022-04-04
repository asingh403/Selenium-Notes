package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffLinkPrint {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/bse");
		
		
		By links = By.xpath("//div[@class= 'hmbseindicestable show']/ul[@class='bold']//following-sibling::ul/li/a");
		

		List<WebElement> bse_liks = driver.findElements((links));
		
		
		for(WebElement e: bse_liks) {
			System.out.println(e.getText()+ " : "+e.getAttribute("href"));
		}

	}
}