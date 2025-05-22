package package1;

import org.testng.annotations.Test;

public class Test2 {
@Test(priority=2)
	
	void logout() 
	{
		System.out.println("This is Login");
	}
	
	@Test(priority=2)
	void facebook()
	{
		System.out.println("This is Searching");
	}
	
	@Test(priority=2)
	void close()
	{
		System.out.println("This is close");
	}

}
