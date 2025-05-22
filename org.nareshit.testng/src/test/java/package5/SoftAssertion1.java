package package5;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
	
	@Test
	void testSoftAssertion()
	{
		System.out.println("This is first Test");
		System.out.println("This is Second Test");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("This is third Test");
		System.out.println("This is fourth Test");
		sa.assertAll();
	}

}
