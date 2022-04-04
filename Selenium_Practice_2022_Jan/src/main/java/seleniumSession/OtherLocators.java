//https://app.box.com/file/904811501684
package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
	
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		//boolean flag = driver.findElement(emailId).isDisplayed();
		//System.out.println(flag);
		
		if(doIsDisplayed(emailId)){
			System.out.println("Element is Displayed...");
		}
		
	}
	private static boolean doIsDisplayed(By emailId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static boolean doIsDisplayed(By locator) {
//		return getElement(locator).isDisplayed();
//	}
	
	

}
