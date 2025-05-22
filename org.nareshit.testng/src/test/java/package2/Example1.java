package package2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1
{
  @BeforeMethod
  public void login() 
  {
	System.out.println("Login Completed");  
  }
  
  @Test(priority=1)
  public void serach()
  {
	  System.out.println("Search Completed");
  }
  
  @Test(priority=2)
  public void advSearch()
  {
	  System.out.println("Adv Search Completed");
  }
  
  @AfterMethod
  public void logout()
  {
	  System.out.println("Logout Completed");
  }
}
