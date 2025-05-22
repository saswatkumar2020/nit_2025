package open_new_tab_new_window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		Set<String> ids=driver.getWindowHandles();
		List<String> wids=new ArrayList<String>(ids);
		driver.switchTo().window(wids.get(0));
		driver.close();
	}

}
