package open_new_tab_new_window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//New Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		Thread.sleep(3000);
		driver.quit();
	}

}
