package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		//while loop
		//sleep(static wait) --> dynamic wait
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");

		// WebDriver[C]--> FluentWait[C] --> Wait[I] (until();)

		By emailId = By.id("input-email11");
		
		retryingElement(emailId, 20, 3000).sendKeys("ashutosh@gmail.com");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static WebElement retryingElement(By locator, int timeout) {
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeout) {
			
			try {
				element = getElement(locator);
				break;
			}
			catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : "+ attempts + " : "+ locator);
				try {
					Thread.sleep(500);	
				} catch (InterruptedException e1) {
					System.out.println(e1);
				}				
			}
			attempts++;			
		}
		
		if(element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("element is not found exception ... tried for : "+ timeout + 
									" with the interval of : "+ 500 + "ms");
			}
		}
		return element;		
	}
	
	
	public static WebElement retryingElement(By locator, int timeout, long pollingTime) {
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeout) {
			
			try {
				element = getElement(locator);
				break;
			}
			catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : "+ attempts + " : "+ locator);
				try {
					Thread.sleep(pollingTime);	
				} catch (InterruptedException e1) {
					System.out.println(e1);
				}				
			}
			attempts++;			
		}
		
		if(element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("element is not found exception ... tried for : "+ timeout + 
									" with the interval of : "+ pollingTime + "ms");
			}
		}
		return element;		
	}

}
