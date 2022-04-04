package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Practice {
	static WebDriver driver;
	
	public static void webTableHandling(String URL, By locators) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		
		WebElement ele = driver.findElement(locators);
		
		//ele.click();
		String textname = ele.getText();
		
		System.out.println(textname);
	}

	public static void main(String[] args) {
		String url = "http://seleniumpractise.blogspot.com/";
		
		String text = "FlipKart";
		int index = 1;
		
//		WebElement locators = driver.findElement(By.xpath("//*[td= '"+text+"']//td['"+index+"']"));
//		WebElement locators = driver.findElement(By.xpath("//*[td= 'Flipkart']//td[1]"));
		
		
		By locators = By.xpath("//table[@id='customers']//td[2]");
		
		webTableHandling(url, locators);

	}

}


//*[td='FlipKart']//td[1]
//*[td= 'Flipkart']//td['1']

