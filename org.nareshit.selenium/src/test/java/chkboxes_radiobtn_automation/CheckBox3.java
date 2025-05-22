package chkboxes_radiobtn_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(chkboxes.size());
		for(int i=1;i<chkboxes.size();i++)	//i=1 1<4 true / i=2 2<4 true / i=3 3<4 true
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
		Thread.sleep(2000);
		driver.close();
	}
}
