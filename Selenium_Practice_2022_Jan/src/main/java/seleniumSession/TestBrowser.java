package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ashutoshsingh/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);
		//driver.quit();
		
		
		
	}

}
