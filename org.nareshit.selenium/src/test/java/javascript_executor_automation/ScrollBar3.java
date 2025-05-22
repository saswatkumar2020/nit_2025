package javascript_executor_automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollBar3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		
		//Scroll till the end of the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		
		//To verify the pixel
		@Nullable Object ob=js.executeScript("return window.pageYOffset", "");
		System.out.println(ob);
		
		//Scroll back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		Thread.sleep(2000);
		
		//To verify the pixel
		@Nullable Object ob1=js.executeScript("return window.pageYOffset", "");
		System.out.println(ob1);
		
		driver.close();

	}

}
