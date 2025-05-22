package package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example2 
{
  @BeforeClass
  public void login() 
  {
	  System.out.println("");
	  System.out.println("Login Completed");
  }
  
  @Test(priority=1)
  public void search()
  {
	  System.out.println("Search Completed");
  }
  
  @Test(priority=2)
  public void advSearch()
  {
	  System.out.println("Advanced Search Completed");
  }
  
  @AfterClass
  public void logout()
  {
	  System.out.println("Logout Completed");
  }
}
