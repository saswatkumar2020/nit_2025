package mouse_actions_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//Switch to innerFrame
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		//Field1 clear and enter new value
		WebElement fld1=driver.findElement(By.cssSelector("[id='field1']"));
		fld1.clear();
		fld1.sendKeys("Welcome");
		
		//mouse action double click 
		WebElement copy_btn=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		Actions action=new Actions(driver);
		action.doubleClick(copy_btn).build().perform();
		
		//Verify field1 and field2 value
		WebElement fld2=driver.findElement(By.cssSelector("[id='field2']"));
		String s2=fld2.getDomProperty("value");   //getAttribute
		System.out.println(s2);
		String s22=fld2.getDomAttribute("id");
		System.out.println(s22);
		if(s2.equals("Welcome"))
		{
			System.out.println("Text copied");
		}
		else
		{
			System.out.println("Text is not copied");
		}
		driver.close();
	}

}
