package webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		//driver.findElement(By.xpath("//a[contains (text(),'Register')]")).click();
		WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@id='gender-female']"));
		WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@id='gender-male']"));
		maleRadioBtn.click();
		boolean selected1=maleRadioBtn.isSelected();
		boolean selected2=femaleRadioBtn.isSelected();
		System.out.println("Male Radio Btn Selected: "+selected1);
		System.out.println("Female Radio Btn Selected: "+selected2);
		WebElement newsLtrChkbox=driver.findElement(By.xpath("//input[@id='Newsletter']"));
		boolean selected3=newsLtrChkbox.isSelected();
		System.out.println("NewsLetter checkbox is checked: "+selected3);
		Thread.sleep(5000);
		driver.close();
	}
}
