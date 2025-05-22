package package3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void m1()
	{
		System.out.println("This is m1 from Class1");
	}
	
	@BeforeTest
	public void m3()
	{
		System.out.println("This is -m3 method from Class1");
	}

}
