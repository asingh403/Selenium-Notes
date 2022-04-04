package seleniumSession;

public class DriverSetProp {


private final String key = "webdriver.chrome.driver";
private final String value = "/Users/ashutoshsingh/Documents/chromedriver";
private final String setProp = System.setProperty(key, value);
	
	public String getProp() {
		return setProp;
	}
	
}
