package package4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion3 {
	
	@Test
	public void test()
	{
		//Assert.assertNotEquals("ALLU","ARJUN");	
		Assert.assertEquals("ALLU", "ALLU");
		Assert.fail();		//if we want to fail our test method use this
	}

}
