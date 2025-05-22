package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to(" https://opensource-demo.orangehrmlive.com");
		WebElement un=driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[1]"));
		WebElement pw=driver.findElement(By.xpath("(//div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//input)[2]"));
		WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
		un.sendKeys("Admin");
		pw.sendKeys("admin123");
		login.submit();
		WebElement profile=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		profile.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[last()]"));
		logout.click();
		Thread.sleep(2000);
		driver.close();

	}

}
