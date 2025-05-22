package package4;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion2 {
	
	@Test
	void testTitle()
	{
		String exp_title="IRCTC home";
		String act_title="IRCTC hotel";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Fail");
			Assert.assertTrue(false);
		}
	}
}
