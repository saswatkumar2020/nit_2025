package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");

	}

}
