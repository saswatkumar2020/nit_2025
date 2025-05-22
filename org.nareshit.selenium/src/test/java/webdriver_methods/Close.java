package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Close {
	public static void main(String[] args) {
		//Open the Browser
		WebDriver driver=new ChromeDriver();
		
		//Open the Application
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		
		//driver pointing  Parent url
		System.out.println(driver.getCurrentUrl());
		
		//Only Parent Window will close
		driver.close();
	}
}
