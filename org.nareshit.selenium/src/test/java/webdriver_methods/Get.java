package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
		WebDriver driver=new ChromeDriver();
				
		//Open the Application
		driver.get("https://www.google.com/");
				
		//Close the Application
		driver.close();
	}
}
