package javascript_executor_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar_Challange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//First Scroll to the Element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(3000);
		WebElement signinBtn=driver.findElement(By.xpath("//div[@class='rhf-sign-in-tooltip-new-customer']"));
		
		
		//Scroll Down the page until the element is visible
		js.executeScript("arguments[0].scrollIntoView(true);", signinBtn);
		Thread.sleep(3000);
		driver.close();

	}

}
