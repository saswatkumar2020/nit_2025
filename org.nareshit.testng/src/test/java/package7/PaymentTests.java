package package7;

import org.testng.annotations.Test;

public class PaymentTests {
	
	@Test(priority=1,groups= {"smoke","regression","functional"})
	public void paymentInRupees() {
		System.out.println("Payment in Rupees");
	}
	
	@Test(priority=2,groups= {"smoke","regression","functional"})
	public void paymentInDollar() {
		System.out.println("Payment in Dollar");
	}
	
}
