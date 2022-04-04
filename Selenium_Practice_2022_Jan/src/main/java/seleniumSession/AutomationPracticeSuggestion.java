package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSuggestion {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(), 'Casual Dresses > Printed')]"));
		
		
		/**
		List<WebElement> dressOptions = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
				
		System.out.println(dressOptions.size());
		
		driver.quit();
		
		for(WebElement e: dressOptions) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("Casual Dresses")) {
				e.click();
				break;
			}
		}
		**/
		
		selectOptionFromSuggList("Casual Dresses > Printed");

	}
	
	//Casual Dresses > Printed
	
	
	public static void selectOptionFromSuggList(String value) {
		driver.findElement((By.xpath("//div[@class='ac_results']//li[contains(text(), '"+value+"')]")));
	}

}
