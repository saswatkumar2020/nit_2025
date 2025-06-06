package frames_automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		
		//Find the First Frame and switch to Frame
			WebElement frame1=driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
			driver.switchTo().frame(frame1);
			//driver.switchTo().frame(0);
			WebElement f1Textbox=driver.findElement(By.xpath("//input[@name='mytext1']"));
			f1Textbox.sendKeys("Saswat");
		
		//Switch from First Frame to Parent Window / Default Content
			driver.switchTo().defaultContent();
			
		
		//Switch to Second Frame
			WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
			driver.switchTo().frame(frame2);
			WebElement f2Textbox=driver.findElement(By.xpath("//input[@name='mytext2']"));
			f2Textbox.sendKeys("Saswat");
			
		//Switch from Second Frame to Parent Window / Default Content
			driver.switchTo().parentFrame();
			
		//Switch to Third Frame
			WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			driver.switchTo().frame(frame3);
			WebElement f3Textbox=driver.findElement(By.xpath("//input[@name='mytext3']"));
			f3Textbox.sendKeys("Saswat");
			Thread.sleep(2000);
			driver.close();
	}

}
