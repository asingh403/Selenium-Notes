package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.whenwise.com/sign-in");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("email")).sendKeys("asingh.tic@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1108noki@");
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://www.whenwise.com/users/3125/edit");
		
		WebElement ele = driver.findElement(By.xpath("//span[text() = 'Email on booking confirmation?']"));
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		

	}

}
