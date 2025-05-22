package alert_automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlerts {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert prmptAlert=driver.switchTo().alert();
		System.out.println(prmptAlert.getText());
		
		//Enter text into the alert
		prmptAlert.sendKeys("Saswat G");
		prmptAlert.accept();
		
		WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'You entered:')]")));
		System.out.println(message.getText());
		if(message.getText().contains("Saswat G")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
