package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
		WebDriver driver=new ChromeDriver();
				
		//Open the Application
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(5000);
				
		//driver pointing  Parent url
		System.out.println(driver.getCurrentUrl());
				
		//All Window will close
		driver.quit();
	}
}
