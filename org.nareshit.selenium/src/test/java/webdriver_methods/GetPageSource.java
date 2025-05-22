package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	
	public static void main(String args[]) {
		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
				
		//Launch WebApplication
		driver.get("https://www.google.com/");
		
		//Get Page Source of Current Page
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
	
	}
}
