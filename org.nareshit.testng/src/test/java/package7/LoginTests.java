package package7;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority=1,groups= {"smoke"})
	public void loginByGmail() {
		System.out.println("This is login by Gmail...");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void loginByFaceBook() {
		System.out.println("This is login by FaceBook...");
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void loginBySkype() {
		System.out.println("This is login by Skype...");
	}
}
