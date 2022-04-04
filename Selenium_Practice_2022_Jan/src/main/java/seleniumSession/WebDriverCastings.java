package seleniumSession;

import java.net.URL;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCastings {

	public static void main(String[] args) {
		
		//1. WD - CD - local
		//WebDriver driver = new ChromeDriver();
		
		//2. ChromeDriver = new ChromeDriver();
		
		//3. RWD - CD - local
		//RemoteWebDriver driver = new ChromeDriver();
		
		//4. WB - RWD - remote machine/Server/VM/docker/cloud Vendor
		//WebDriver driver = new RemoteWebDriver(new URL("192.168.23.13"), capabilities);
		
		
		//5. SC - CD:
		//SearchContext driver = new ChromeDriver();
		
		//6. SearchContext - RWD
		//SearchContext driver = new RemoteWebDriver(new URL("192.168.23.13"), capabilities);
		
		
		
		
		
		

	}

}
