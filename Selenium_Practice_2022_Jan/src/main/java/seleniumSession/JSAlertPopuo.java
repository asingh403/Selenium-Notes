package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopuo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().fullscreen();
		
		WebElement loginBtn = driver.findElement(By.name("proceed"));
		
		loginBtn.click();
		
		Thread.sleep(5000);
		
			Alert alert =driver.switchTo().alert();
			
			String alertTest = alert.getText();
			System.out.println(alertTest);
			alert.accept(); // click on OK button
			//alert.dismiss(); //to cancel the alert.
		
	}

}
