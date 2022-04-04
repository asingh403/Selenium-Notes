package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		//headless: No browser (not visible)
		//testing is happening behind the scene
		
		

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		//to run the TC in incognito mode
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		

		driver.get("http://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
