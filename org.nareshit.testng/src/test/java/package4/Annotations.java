package package4;

import org.testng.annotations.*;

public class Annotations {

	@BeforeSuite
	public void bs()
	{
		System.out.println("This is Before Suite Method");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test Method");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before Class Method");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Method Method");
	}
	
	@Test(priority=1)
	public void m1() 
	{
		System.out.println("This is m1 method");
	}
	
	@Test(priority=2)
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method Method");
	}

	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class Method");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test Method");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("This is After Suite Method");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	