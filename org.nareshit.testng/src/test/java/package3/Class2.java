package package3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void m2()
	{
		System.out.println("This is m2 from Class2");
	}
	
	@AfterTest
	public void m4()
	{
		System.out.println("This is -m4 method from Class2");
	}

}
