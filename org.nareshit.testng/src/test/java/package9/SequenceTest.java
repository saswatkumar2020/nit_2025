package package9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SequenceTest {

	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(String br) {
		switch(br.toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=1)
	public void testLogo() throws InterruptedException {
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//*[@alt='Facebook']"));
		Assert.assertEquals(logo.isDisplayed(), true);
	}
	
	@Test(priority=2)
	public void testTitle() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=3)
	public void testURL() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
