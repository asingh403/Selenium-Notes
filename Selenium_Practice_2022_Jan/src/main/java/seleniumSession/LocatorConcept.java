package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//Create the Webelement + actions(click, sendkeys, gettext, isdisplayed)
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		/**
		 * 2nd approach
		 */
		
		/**
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailId.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		
		System.out.println(driver.getTitle());
		
		**/
		
//		By username = By.id("input-email");
//		By password = By.id("input-password");
		
//		WebElement emailId = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		
//		emailId.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");
//		
//		System.out.println(driver.getTitle());
//		
//		
//		driver.quit();
		
		/**
		 * 4th Approach
		 */
		
//		By username = By.id("input-email");
//		By password = By.id("input-password");
		
//		getElement(username).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5th approach
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(username, "test@gmail.com");
//		doSendKeys(password, "test@12345");

		
		//6. Elementutil class with generic methods
		
//		By username = By.id("input-email");
//		By password = By.id("input-password");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@123.in");
//		eleUtil.doSendKeys(password, "test@123	");
		
		
		//7th. String locators values
		
		String userName = "input-email";
		String password = "input-password";
		
		doSendKeys("id", userName, "asingh@test.com");
		doSendKeys("id", password, "test@4566");
		
		
	}
	
	public static By getBy(String locatorType, String locatorValue) {
		
		By locator = null;
		
		switch(locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
			
		default:
			System.out.println("Please pass the right locator type and value .....");
			break;
		}
		
		return locator;
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static WebElement getElement(String locatorType, String locatorValue) {
		
		return driver.findElement(getBy(locatorType, locatorValue));
		
	}
	
	public static void doSendKeys(By locators, String value) {
		
		getElement(locators).sendKeys(value);
		
	}
	
	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		
		getElement(locatorType, locatorValue).sendKeys(value);
		
	}
	

}
