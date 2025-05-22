package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String args[]) {
		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
				
		//Launch WebApplication
		driver.get("https://www.google.com/");
		
		//Get url of Current Page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.startsWith("https")) {
			System.out.println("\nPage is Secured");
		}
		else {
			System.out.println("\nPage is Unsecured");
		}
		driver.close();
	}
}
