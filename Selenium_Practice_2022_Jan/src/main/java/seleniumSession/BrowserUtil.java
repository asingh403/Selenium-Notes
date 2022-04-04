package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;

	/**
	 * this method will initialize the driver on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this will return the driver
	 */

	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is : " + browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
			
		}else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();		
			
		}
		else {
			System.out.println("Browser not found...Please pass the right browser name...");
			
		}
		return driver;
	}
	
	/**
	 * This method will launch the URL 
	 * @param url
	 */
	
	public void enterUrl(String url) {
		if (url == null)
			return;
		if (url.isEmpty())
			return;
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
