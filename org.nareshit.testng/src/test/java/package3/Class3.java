package package3;

import org.testng.annotations.*;

public class Class3 {
	
	@BeforeSuite
	public void m6() 
	{
		System.out.println("This is m6 BeforeSuite Method");
	}
	
	@AfterSuite
	public void m7()
	{
		System.out.println("This is m7 AfterSuite Method");
	}

}
