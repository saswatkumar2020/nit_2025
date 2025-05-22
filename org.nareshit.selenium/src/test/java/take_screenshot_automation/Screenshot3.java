package take_screenshot_automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement mobile=driver.findElement(By.cssSelector("[alt='Picture for category Electronics']"));
		File sourceFile=mobile.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\mobile.png");
		sourceFile.renameTo(targetFile);

	}

}
