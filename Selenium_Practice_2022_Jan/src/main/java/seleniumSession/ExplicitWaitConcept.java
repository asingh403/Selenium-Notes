package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://classic.freecrm.com/index.html");
		
		
		By username = By.name("username");
		By password= By.name("password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		userName_ele.sendKeys("ashutosh");
		driver.findElement(password).sendKeys("test@1234");
		driver.findElement(loginBtn).click();

	}

}
