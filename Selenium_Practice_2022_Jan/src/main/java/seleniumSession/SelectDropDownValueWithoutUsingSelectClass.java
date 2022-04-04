package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithoutUsingSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		By country = By.id("Form_submitForm_Country");
		 By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		 dropDownValueWithoutSelect(countryOptions, "India");

	}
	
	
//	public static List<WebElement> getElements(By locators,  ) {
//		return driver.findElements(locators);
//	}
	
	public static void dropDownValueWithoutSelect(By locators, String value) {
		List<WebElement> countryList = driver.findElements(locators);
		
		System.out.println("Total number of Countries :: "+ countryList.size());
				
		for(WebElement e: countryList) {			
			System.out.println(e.getText());
				
			if(e.getText().equals(value)) {
				e.click();
				break;
			}			
		}		
	}
	
	


}
