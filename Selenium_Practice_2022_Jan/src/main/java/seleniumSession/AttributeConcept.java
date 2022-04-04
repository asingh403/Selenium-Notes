package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().fullscreen();
//			String hrefVal = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
//			System.out.println(hrefVal);

		By tgName = By.tagName("a");
		List<WebElement> listLinks = getElements(tgName);
		// driver.findElements(By.tagName("a"));

		int notBlankLink = 0;
		for (WebElement e : listLinks) {

			if (!(e.getText().isEmpty())) {
				System.out.println(e.getText());
				notBlankLink++;
			}

		}
		System.out.println("Not empthy links : " + notBlankLink);
		System.out.println("total Blank links  : " + Math.abs(notBlankLink - listLinks.size()));
		System.out.println("total number of Links :: " + listLinks.size());

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static String getAttribute(By locator, String strName) {
		return getElement(locator).getAttribute(strName);

	}
}
