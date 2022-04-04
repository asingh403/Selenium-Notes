package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForJSAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//driver.switchTo().alert(); no need to write in below line
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();

	}
	
	
	public static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static String getAlertText(int timeout) {
		return waitForAlert(timeout).getText();
	}
	
	
	public static void doAlertAccept(int timeout) {
		waitForAlert(timeout).accept();
	}
	
	public static void doAlertDismiss(int timeout) {
		waitForAlert(timeout).dismiss();
	}
	
	public static void enterAlertText(String value, int timeout) {
		waitForAlert(timeout).sendKeys(value);
	}

}
