package package5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion2 {
	
	@Test
	void testHardAssertion()
	{
		System.out.println("This is first Test");
		System.out.println("This is Second Test");
		
		Assert.assertEquals(1, 2);
		//Here Test will not remaining statement because it got failed
		
		System.out.println("This is third Test");
		System.out.println("This is fourth Test");
	}

}
