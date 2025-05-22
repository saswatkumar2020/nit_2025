package alert_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlerts1 {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		button.click();
		Thread.sleep(3000);
		
		
		//JS Alert
		Alert normalAlert=driver.switchTo().alert();
		normalAlert.accept();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
