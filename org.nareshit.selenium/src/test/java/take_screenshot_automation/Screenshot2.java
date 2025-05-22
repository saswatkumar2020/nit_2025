package take_screenshot_automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement newsSection=driver.findElement(By.cssSelector("[class='news-list-homepage']"));
		File sourceFile=newsSection.getScreenshotAs(OutputType.FILE);	//WebElement also as getScreenshotAs method
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\newssection.png");
		sourceFile.renameTo(targetFile);

	}

}
