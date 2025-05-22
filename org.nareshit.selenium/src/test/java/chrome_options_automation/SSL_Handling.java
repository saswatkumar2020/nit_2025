package chrome_options_automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		//option.setAcceptInsecureCerts(false);	//By Default 
		option.setAcceptInsecureCerts(true);	//Accept SSL Certificate
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("URL of the page is:"+driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		

	}

}
