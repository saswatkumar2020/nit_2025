package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		//Explicit wait Declaration
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to(" https://opensource-demo.orangehrmlive.com");
		
		//Utilization of of explicit wait(Apply required conditions here)
		WebElement un=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[1]")));
		WebElement pw=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//input)[2]")));
		
		
		WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
		un.sendKeys("Admin");
		pw.sendKeys("admin123");
		login.submit();
		
		//Utilization of of explicit wait(Apply required conditions here)
		WebElement profile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab']")));
		profile.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[last()]"));
		logout.click();
		Thread.sleep(2000);
		driver.close();

	}

}
