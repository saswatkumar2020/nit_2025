package chkboxes_radiobtn_automation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(chkboxes.size());
//		for(WebElement cbs:chkboxes) 
//		{
//			String s1=cbs.getText();
//			System.out.println(s1);
//			if( s1.equals("Person With Disability Concession") || s1.equals("Flexible With Date") || s1.equals("Train with Available Berth") || s1.equals("Railway Pass Concession")) 
//			{
//				cbs.click();
//				if(s1.equals("Person With Disability Concession") || s1.equals("Railway Pass Concession"))
//				{
//				WebElement okbtn=driver.findElement(By.xpath("//span[text()='OK']"));
//				okbtn.click();
//				}
//				else 
//				{
//				continue;
//				}
//			}
			for(int i=0;i<chkboxes.size();i++) 
			{
				String s2=chkboxes.get(i).getText();
				System.out.println(s2);
				if( s2.equals("Person With Disability Concession") || s2.equals("Flexible With Date") || s2.equals("Train with Available Berth") || s2.equals("Railway Pass Concession")) 
				{
					chkboxes.get(i).click();
					if(s2.equals("Person With Disability Concession") || s2.equals("Railway Pass Concession"))
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
