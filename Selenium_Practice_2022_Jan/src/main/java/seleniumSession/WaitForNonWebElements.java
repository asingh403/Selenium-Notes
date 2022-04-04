package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElements {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Contact us")).click();
		
		//wait for url
		
		if(waitForUrlToContain("controller=contact", 5)) {
			System.out.println("URL is correct....");
		}
		
		String title = doGetTitle("Contact us - My Store", 5);
		System.out.println(title);

		

	}
	
	public static String doGetTitleWithFraction(String titleFraction, int timeout) {
		if(waitForTitleContains(titleFraction, timeout)) {
			return driver.getTitle();
		}
		return null;
	}
	
	public static String doGetTitle(String title, int timeout) {
		if(waitForTitleToBe(title, timeout)) {
			return driver.getTitle();
		}
		return null;
	}
	
	public static boolean waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(titleFraction));
		
	}
	
	public static boolean waitForTitleToBe(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleIs(titleFraction));
		
	}
	
	public static Boolean waitForUrlToContain(String fractions, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(fractions));
		
	}
	
	public static Boolean waitForUrlToBe(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlToBe(url));
		
	}
	
	
	/************* Alert Utils ************/

	public Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public String getAlertText(int timeout) {
		return waitForAlert(timeout).getText();
	}
	
	
	public void doAlertAccept(int timeout) {
		waitForAlert(timeout).accept();
	}
	
	public void doAlertDismiss(int timeout) {
		waitForAlert(timeout).dismiss();
	}
	
	public void enterAlertText(String value, int timeout) {
		waitForAlert(timeout).sendKeys(value);
	}

}
