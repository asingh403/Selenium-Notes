package seleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com");

		By username = By.name("username//"); // providing a wrong locator so we can check our custom polling time
		By password = By.name("password");
		By loginBtn = By.xpath("//input[@type='submit']");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement userName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));

		// doSendKeys(username, "ashutosh", 10);

//		doPresenceOfElementLocated(username, 10, 2000);
//		driver.findElement(password).sendKeys("test123");
//		driver.findElement(loginBtn).click();
		
		By footers = By.xpath("//footer//ul[@class = 'footer-nav']//a");
		List<WebElement> footerList = waitForElementsToBeVisible(footers, 5);
		
//		for(WebElement e:footerList) {
//			System.out.println(e.getText());
//		}
		
		
		if(getElementsTextListWithWait(footers, 5).contains("Leadership")) {
			System.out.println("Pass");
			
		}
	}

	public static void doSendKeys(By locator, String value, int timeout) {
		doPresenceOfElementLocated(locator, 10).sendKeys(value);
	}

	public static WebElement doPresenceOfElementLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public static WebElement doPresenceOfElementLocated(By locator, int timeout, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	* An expectation for checking that an element is present on the DOM of a page
	* and visible. Visibility means that the element is not only displayed but also
	* has a height and width that is greater than 0.
	**/

	public static WebElement isElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public static WebElement waitForElementToBeVisible(By locator, int timeout, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public static WebElement waitForElementToBeVisibleWithWebElement(By locator, int timeout, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));

	}
	
	public static List<WebElement> waitForElementsToBeVisible(By locator, int timeout, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
	
	public static List<WebElement> waitForElementsToBeVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
	
	
	public static List<String> getElementsTextListWithWait(By locator, int timeout) {
		
		List<WebElement> eleList = waitForElementsToBeVisible(locator, timeout);
		List<String> eleTextList = new ArrayList<>();
		for(WebElement e:eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		
		return eleTextList;
		
	}
	
	

}
