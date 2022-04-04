package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		driver.manage().window().fullscreen();
		
		By formFields = By.className("text");
		int fieldsCount = driver.findElements(formFields).size();
		if(fieldsCount == 0) {
			System.out.println("Form fiels not available...");
		}else {
			System.out.println("Form fiels available...");
		}
		
		
		//Verify single element
		
		By contactSalesLink = By.linkText("CONTACT SALES");
		
		boolean flag =driver.findElement(contactSalesLink).isDisplayed();
		System.out.println(flag);
		
//		driver.findElement(contactSalesLink).click();
//		String currentUrl = driver.getCurrentUrl();
//		if(currentUrl.contains("contact-sales")) {
//			System.out.println("User is on CONTACT-SALES page");
//		}
		
		System.out.println(isElementExist(contactSalesLink));


	}
	
	
	public static boolean isElementExist(By locator) {
		int elementCount = driver.findElements(locator).size();
		System.out.println("total element Count "+ elementCount);
		
		if(elementCount >= 1) {
			System.out.println("element is found ... "+ locator);
			return true;
		}
		else {
			System.out.println("element is NOT found ... "+ locator);
			return false;
		}
		
	}

}
