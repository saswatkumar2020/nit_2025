package alert_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationAlerts {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		button.click();
		
		//utilization of explicitwait
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}


}
