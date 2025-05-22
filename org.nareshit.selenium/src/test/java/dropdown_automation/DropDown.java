package dropdown_automation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		WebElement reg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='REGISTER']")));
		reg.click();
		
		WebElement country=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country']")));
		//Select Options from dropdown
		Select ob=new Select(country);
		ob.selectByVisibleText("BAHAMAS");
		List<WebElement> options=ob.getOptions();
		System.out.println("Total Select Items:"+options.size());
		/*
		 * for(WebElement w:options) { System.out.println(w.getText()); }
		 */
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(2000);
		driver.close();
	}

}
