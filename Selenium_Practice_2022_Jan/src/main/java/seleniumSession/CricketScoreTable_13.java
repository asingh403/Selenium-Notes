package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CricketScoreTable_13 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.espncricinfo.com/series/england-tour-of-west-indies-2021-22-1256716/west-indies-vs-england-3rd-test-1256728/full-scorecard";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(12000);
		
		System.out.println(getwicketTakerName("Dan Lawrence"));

	}
	
	
	
	public static String getwicketTakerName(String playerName) {
		
		String xpath = "//a[text()= '"+playerName+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
		
	}

}
