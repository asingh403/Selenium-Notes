package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//List<WebElement> companyNames = driver.findElements(By.xpath("//table[@id = 'customers']//tr/td[1]"));
		
		// "//table[@id = 'customers']//tr[4]/td[1]";
//		String beforeXpath = "//table[@id = 'customers']//tr[";
//		String afterXpath = "]/td[1]";
//		
//		int rowCount = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size();
//		
//		for(int i=2; i<=rowCount; i++) {
//			String compXpath = beforeXpath+i+afterXpath;
//			//System.out.println(compXpath);
//			
//			
//			String textTableData = driver.findElement(By.xpath(compXpath)).getText();
//			System.out.println(textTableData);
//		}
		
		
		//********* For table data printing xpath created *********//
		
		By rowCount = By.xpath("//table[@id = 'customers']//tr");
		By colCount = By.xpath("//table[@id = 'customers']//tr[1]/th");
		String beforeXpath = "//table[@id = 'customers']//tr[";
		String afterXpath = "]/td[";
		
		
		
		Thread.sleep(4000);
		
		printTable(rowCount, colCount, beforeXpath, afterXpath);
		driver.quit();

	}
	
	
	public static void printTable(By rowLocators, By colLocators, String beforeXpath, String afterXpath) {
		int rowCount = driver.findElements(rowLocators).size();
		int colCount =  driver.findElements(colLocators).size();
		for(int row=2; row<=rowCount; row++) {
			for( int col = 1; col<=colCount; col++) {
				String xpath = beforeXpath+row+afterXpath+col+"]";
				//System.out.println(xpath);
				
				String eleText = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(eleText+" ");
			}
		}
		
	}

}
