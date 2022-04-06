package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorTest {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("email")).sendKeys("asingh@@@gmail.@");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		System.out.println(driver.findElement(By.cssSelector("div.form-group.form-error")).isDisplayed());
		
		

	}

}
