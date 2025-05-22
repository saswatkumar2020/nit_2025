package locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ClassName {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		List<WebElement> items=driver.findElements(By.className("list-unstyled"));
														//ul[@class='list-unstyled']
		System.out.println(items.size());
	}

}
