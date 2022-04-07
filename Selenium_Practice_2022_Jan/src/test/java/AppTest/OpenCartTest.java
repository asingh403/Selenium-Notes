package AppTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void registerLinkTest() {
		driver.get("https://www.opencart.com/index.php?route=account/login");
		boolean flag = driver.findElement(By.linkText("REGISTER")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}

}
