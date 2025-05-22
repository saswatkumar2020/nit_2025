package package5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion1 {
	
	@Test
	void testHardAssertion()
	{
		System.out.println("This is first test");
		System.out.println("This is second test");
		
		Assert.assertEquals(1,1);
		
		System.out.println("This is third test");
		System.out.println("This is fourth test");
	}

}
