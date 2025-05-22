package webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean displayed=logo.isDisplayed();
		System.out.println(displayed);
		Thread.sleep(2000);
		driver.close();
	}

}
