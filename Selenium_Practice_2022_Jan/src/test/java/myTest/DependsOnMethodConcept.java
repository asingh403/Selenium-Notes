package myTest;

import org.testng.annotations.Test;


public class DependsOnMethodConcept {
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login to app...");
	}
	
	@Test(dependsOnMethods ="loginTest", priority = 2)
	public void homePageTest() {
		System.out.println("homePage test...");
	}
	
	@Test(dependsOnMethods ="loginTest", priority = 3)
	public void searchTest() {
		System.out.println("search Test...");
	}
	

}
