package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.google.com/");
		driver.get("https://www.amazon.com/");  // to per for the jsUtil.scrollView
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("alert('Hi')");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
		
		
		//jsUtil.generateAlert("This is my JS pop-up");
//		String innerText = jsUtil.getPageInnerText();		
//		System.out.println(innerText);
//		System.out.println(innerText.contains("Business"));
		
		
//		WebElement ele = driver.findElement(By.xpath("//a[text()= \"Gmail\"]"));
		
		//jsUtil.drawBorder(ele);
		//jsUtil.refreshBrowserByJS();
		
//		jsUtil.flash(ele);
//		
//		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
//		jsUtil.clickElementByJS(gmailLink);
		
		
		
		
		WebElement specific_Ele = driver.findElement(By.xpath("//span[text() = 'Popular products in Wireless internationally']"));
		jsUtil.scrollIntoView(specific_Ele);
		System.out.println(specific_Ele.getText());
		
		
		
		

	}

}
