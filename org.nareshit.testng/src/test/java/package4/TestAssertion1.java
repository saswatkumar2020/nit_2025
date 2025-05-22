package package4;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestAssertion1 {
	
	@Test
	public void testTitle()
	{
		String exp_title="IRCTC Home";
		String act_title="IRCTC home";
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("Test Pass");
//		}
//		else
//		{
//			System.out.println("Test Fail");
//		}
		
		//Here Internally conditional statement got failed but our TestMethod is still pass.
		
		
		Assert.assertEquals(exp_title, act_title);
	}

}
