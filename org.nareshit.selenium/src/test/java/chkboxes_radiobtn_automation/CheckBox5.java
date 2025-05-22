package chkboxes_radiobtn_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(chkboxes.size());
		
		//Select All CheckBoxes
		for(int i=0;i<chkboxes.size();i++)
		{
			if(chkboxes.get(i).isSelected())
			{
				chkboxes.get(i).click();
			}
			else
			{
				chkboxes.get(i).click();
				if(i==0 || i==3)
				{
					WebElement okbtn=driver.findElement(By.xpath("//span[text()='OK']"));
					okbtn.click();
				}
				else
				{
					continue;
				}
			}
		}
		Thread.sleep(2000);
		
		//Unselect All Checkboxes
		for(int i=0;i<chkboxes.size();i++)
		{
			if(chkboxes.get(i).isSelected())
			{
				chkboxes.get(i).click();
			}
			else
			{
				chkboxes.get(i).click();
				if(i==0 || i==3)
				{
					WebElement okbtn=driver.findElement(By.xpath("//span[text()='OK']"));
					okbtn.click();
				}
				else
				{
					continue;
				}
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
