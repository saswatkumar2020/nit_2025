package package6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test(priority=1)
	public void openApp() {
		Assert.assertTrue(true);
		System.out.println("Application Opened");
	}
	
	@Test(priority=2, dependsOnMethods= {"openApp"})
	public void login() {
		Assert.assertTrue(true);
		System.out.println("Login Completed");
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	public void search() {
		Assert.assertTrue(false);
		System.out.println("Search Completed");
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	public void advSearch() {
		Assert.assertTrue(true);
		System.out.println("Advanced Search Completed");
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	public void logout() {
		Assert.assertTrue(true);
		System.out.println("Logout Completed");
	}
	
}
