package package7;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups= {"regression"})
	public void signupByGmail() {
		System.out.println("This is signup by Gmail");
	}
	
	@Test(priority=2,groups= {"regression"})
	public void signupByFacebook() {
		System.out.println("This is signup by Facebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	public void signupBySkype() {
		System.out.println("This is signup by Skype");
	}

}
