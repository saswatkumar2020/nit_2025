package package8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	public WebDriver driver;
	@BeforeClass
	public void setup() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@Test(dataProvider="dp")
	public void testLogin(String email,String password) throws InterruptedException {
			
			driver.findElement(By.cssSelector("[id='input-email']")).sendKeys(email);
			driver.findElement(By.cssSelector("[id='input-password']")).sendKeys(password);
			driver.findElement(By.cssSelector("[value='Login']")).click();
			Thread.sleep(2000);
			String s1=driver.getCurrentUrl();
			if(s1.equals("https://tutorialsninja.com/demo/index.php?route=account/account")) {
				driver.findElement(By.xpath("//span[text()='My Account']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.findElement(By.xpath("//span[text()='My Account']")).click();
				driver.findElement(By.xpath("//a[text()='Login']")).click();
			}
			else
			{
				//driver.navigate().refresh();
				driver.findElement(By.cssSelector("[id='input-email']")).clear();
				driver.findElement(By.cssSelector("[id='input-password']")).clear();
			}
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();		
	}
	
	@DataProvider(name="dp")
	public Object[][] loginData() {
		Object data[][]= {
				{"x1y1z1@gmail.com","xyz@123"},
				{"x2y2z2@gmail.com","xyz@123"},
				{"x3y3z3@gmail.com","xyz@123"},
				{"x4y4z4@gmail.com","xyz@123"},
				{"x5y5z5@gmail.com","xyz@123"},
				{"x6y6z6@gmail.com","xyz@123"},
				{"x7y7z7@gmail.com","xyz@123"},
				{"x8y8z8@gmail.com","xyz@123"},
				{"x9y9z9@gmail.com","xyz@123"},
				{"x10y10z10@gmail.com","xyz@123"},
				{"abc45@gmail.com","test123"},
				{"xyz67@gmail.com","test012"},
				{"john897@gmail.com","test@123"},
				{"Alluarjun456@gmail.com","test@123"},
				{"john1cam1@gmail.com","test"},
		};
		return data;
	}
	

}
