package webdriver_methods;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		@SuppressWarnings("deprecation")
		URL u=new URL("https://www.google.com/");
		driver.navigate().to(u);
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
