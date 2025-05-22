package keyboard_action_automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTip1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement new_account_btn=driver.findElement(By.xpath("//a[text()='Create new account']"));
		new_account_btn.click();
		
		Actions act=new Actions(driver);
		WebElement dob=driver.findElement(By.xpath("//a[@id='birthday-help']"));
		act.moveToElement(dob).click().build().perform();
		WebElement clickedToolTip1=driver.findElement(By.xpath("//div[@class='_9hzn']"));
		System.out.println(clickedToolTip1.getText());
		
		act.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		
		WebElement gender=driver.findElement(By.xpath("//a[@id='gender-help']"));
		act.moveToElement(gender).click().build().perform();
		WebElement clickedToolTip2=driver.findElement(By.xpath("//div[@class='_9hzn']"));
		System.out.println(clickedToolTip2.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
