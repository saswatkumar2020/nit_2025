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

public class ParallelTest {
	
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void setUp(String br,String url) {
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
		driver.get(url);
	}
	
	@Test(priority=1)
	public void testLogo() throws InterruptedException {
		
		WebElement logo=driver.findElement(By.xpath("//*[@alt='Facebook']"));
		Assert.assertEquals(logo.isDisplayed(), true);
	}
	
	@Test(priority=2)
	public void testTitle() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test
	public void testURL() throws InterruptedException {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
