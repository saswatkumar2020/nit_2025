package javascript_executor_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement searchBox=driver.findElement(By.cssSelector("input#small-searchterms"));

		//enter data into the searchbox
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','IphoNes')",searchBox );
		
		//Click Search Btn
		WebElement searchBtn=driver.findElement(By.xpath("//button[text()='Search']"));
		js.executeScript("arguments[0].click()",searchBtn);
	}

}
