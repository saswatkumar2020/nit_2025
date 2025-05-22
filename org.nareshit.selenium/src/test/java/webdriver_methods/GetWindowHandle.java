package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//Launch WebApplication
		driver.get("https://www.google.com/");
		
		//GetWindowHandleValue
		String windowId=driver.getWindowHandle();
		System.out.println("Window ID is : "+windowId);
		driver.close();
	}
}
