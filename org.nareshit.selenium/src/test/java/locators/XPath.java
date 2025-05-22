package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("J");
		driver.findElement(By.xpath("//*[//*[@name='q' and @class='search-box-text ui-autocomplete-input']]")).sendKeys("E");
		driver.findElement(By.xpath("//*[@name='q' or @id='']")).sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search']")).submit(); //click()
		Thread.sleep(2000);
		
		
		//xpath with starts-with and contains works with dynamic website
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[contains(@class,'_55r1 _6luy')])[1]")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]")).sendKeys("abcdefg");
		
		//Facebook login button is a dynamic button
		driver.findElement(By.xpath("//button [ starts-with ( @id, 'u_0_5')]")).submit();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
