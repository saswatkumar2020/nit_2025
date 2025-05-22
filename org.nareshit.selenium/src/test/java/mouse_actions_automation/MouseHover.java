package mouse_actions_automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement elec_btn=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(elec_btn).build().perform();
		Thread.sleep(2000);
		
		WebElement lpt_dsktp_btn=driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		action.moveToElement(lpt_dsktp_btn).build().perform();
		Thread.sleep(2000);
		
		WebElement lpt_btn=driver.findElement(By.xpath("(//a[text()='Laptops'])[3]"));
		action.moveToElement(lpt_btn).click().build().perform();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
