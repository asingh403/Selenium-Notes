package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
				
		Thread.sleep(5000);
		
		 List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']//span"));
		 
		 System.out.println(suggestionsList.size());
		 
		 for(WebElement e:suggestionsList) {
			 
			 String text = e.getText();
			 System.out.println(text);
			 
			 if(text.contains("indian army")) {
				 e.click();
				 
				 
			 }
		 }
		 // indian army
		
		
		
		//name = q
		
		

	}

}
