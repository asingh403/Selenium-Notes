package seleniumSession;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println("Start Time :: "+ new Date());

		driver.navigate().to("https://www.amazon.in/");

		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println("After back :: " + driver.getTitle());

		driver.navigate().forward();
		System.out.println("After forward :: " + driver.getTitle());

		driver.navigate().back();
		System.out.println("Second After back :: " + driver.getTitle());
		
		System.out.println("End Time :: "+ new Date());
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
