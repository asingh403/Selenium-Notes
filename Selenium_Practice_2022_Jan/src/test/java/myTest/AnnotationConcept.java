package myTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept {
	
	
	/**
	 BS - DB Connection
	 BT - Create User
	 BC - launch Browser/URL
	 
	 BM - loginToApp
	 Test - account info test....
	 AM - logout...
	 
	 BM - loginToApp
	 Test - user info test....
	 AM - logout...
	 
	 AC - close browser...
	 AT - delete user...
	 AS - disconnect DB...
	 */
	
	@BeforeSuite //1
	public void DBConnection() {
		System.out.println("BS - DB Connection");
	}
	
	@BeforeTest //2
	public void createUser() {
		System.out.println("BT - Create User");
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("BC - launch Browser/URL");
	}
	
	@BeforeMethod //4
	public void loginToApp() {
		System.out.println("BM - loginToApp");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("Test - user info test....");
	}
	
	@Test
	public void accountInfoTest() {
		System.out.println("Test - account info test....");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout...");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - close browser...");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - delete user...");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS - disconnect DB...");
	}

}
