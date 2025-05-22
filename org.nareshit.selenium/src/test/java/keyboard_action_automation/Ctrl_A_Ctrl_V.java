package keyboard_action_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ctrl_A_Ctrl_V {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://text-compare.com/");
		
		WebElement textArea=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textArea.sendKeys("Welcome");
		
		Actions action=new Actions(driver);
		
		//CTRL+A Select the Text
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//CTRL+C Copy the Text
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//TAB-Shift to 2nd Text Box
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//CTRL+V Paste the Text
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
