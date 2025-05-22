package mouse_actions_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo");
		
		WebElement rc_btn=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		
		//action.moveToElement(rc_btn).build().perform();
		action.contextClick(rc_btn).build().perform();
		
		
	}
}
