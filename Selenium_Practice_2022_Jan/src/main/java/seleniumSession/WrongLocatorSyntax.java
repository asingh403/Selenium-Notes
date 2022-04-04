package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrongLocatorSyntax {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		driver.manage().window().fullscreen();
		
		By firstName = By.xpath("//*[@id='Form_submitForm_Email']");
		driver.findElement(firstName).sendKeys("Ashutosh");
		

	}

}
