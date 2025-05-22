package dropdown_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDropDown {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		WebElement dropDown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='HTML, CSS']")));
		dropDown.click();
		List<WebElement> options=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains (@class,'multiselect')]/li/a/label[@class='checkbox']")));
		System.out.println(options.size());
		System.out.println("\nFor Loop");
		for(int i=0;i<options.size();i++) {
			//System.out.print("\t");
			String op=options.get(i).getText();
			//System.out.println(op);
			if(op.equals("HTML")|op.equalsIgnoreCase("CSS")) {
				options.get(i).click();
			}
			else {
				options.get(i).click();
				System.out.print("\t");
				System.out.println("Clicked:"+op);
			}
		}
		Thread.sleep(2000);
		System.out.println("\nFor Each Loop");
		for(WebElement op1:options) {
			//System.out.print("\t");
			String s1=op1.getText();
			if(s1.equals("HTML")|s1.equals("CSS")) {
				op1.click();
				System.out.print("\t");
				System.out.println("Clicked:"+op1.getText());
			}
			else { 
				op1.click(); 
			} 
		}
		Thread.sleep(2000);
		driver.close();
	}

}
