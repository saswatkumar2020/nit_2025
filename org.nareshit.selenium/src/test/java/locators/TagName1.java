package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//Count All Links from a WebPage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//Count All Images from a WebPage
		List<WebElement> images=driver.findElements(By.tagName("img"));
		//Count All Elements from a WebPage
		List<WebElement> elements=driver.findElements(By.tagName("*"));	//xpath(//*)
		
		System.out.println(links.size());
		System.out.println(images.size());
		System.out.println(elements.size());
		driver.close();
		
	}

}
