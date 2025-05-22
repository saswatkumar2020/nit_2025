package package1;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=2)
	
	void login() 
	{
		System.out.println("This is Login");
	}
	
	@Test(priority=2)
	void searching()
	{
		System.out.println("This is Searching");
	}
	
	@Test(priority=2)
	void quit()
	{
		System.out.println("This is close");
	}
	
}
