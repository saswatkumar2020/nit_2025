package alert_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NormalAlerts2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='jsAlert()']")));
		button.click();
		
		//utilization of explicitwait
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement message=driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));
		if(message.getText().equals("You successfully clicked an alert")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
