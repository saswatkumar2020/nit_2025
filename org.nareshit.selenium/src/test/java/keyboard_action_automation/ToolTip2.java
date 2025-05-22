package keyboard_action_automation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).build().perform();
		
		WebElement cp=driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
		act.moveToElement(cp).click().build().perform();
		
		WebElement apple=driver.findElement(By.xpath("//div[text()='Apple']"));
		act.moveToElement(apple).build().perform();
		
		System.out.println(apple.getText());
		Thread.sleep(2000);
		driver.close();
		
	}

}
