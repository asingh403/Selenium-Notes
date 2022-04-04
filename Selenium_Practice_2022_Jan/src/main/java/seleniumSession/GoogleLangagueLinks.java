package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangagueLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		By langLinks = By.xpath("//div[@id = 'SIvCob']/a");
		
		clickOnElement(langLinks,"ਪੰਜਾਬੀ");
		
		List<String> actualLinksTextList = getLinksText(langLinks);
		System.out.println("List Name :: "+actualLinksTextList);
		
		if(actualLinksTextList.contains("मराठी")) {
			System.out.println("मराठी Langauge is present here ...");
		}

	}

	public static List<String> getLinksText(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		List<String> linksTextList = new ArrayList<>();

		for (WebElement e : eleList) {
			String text = e.getText().trim();
			linksTextList.add(text);
		}
		return linksTextList;
	} 

	public static void clickOnElement(By locator, String linkText) {
		List<WebElement> langList = driver.findElements(locator);

		for (WebElement e : langList) {
			String text = e.getText().trim();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}
	}
}
