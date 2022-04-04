package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Max {
	
	public static void maxPage(String url, DriverSetProp obj) throws InterruptedException {
				
		obj.getProp();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-fullscreen");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://" + url + ".com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		driver.quit();		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverSetProp obj = new DriverSetProp();
		String http = "facebook";
		maxPage(http, obj);
		
		
	}

}
