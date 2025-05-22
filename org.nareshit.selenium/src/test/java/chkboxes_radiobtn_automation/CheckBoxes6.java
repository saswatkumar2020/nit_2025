package chkboxes_radiobtn_automation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		List<WebElement> chkboxes=driver.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(chkboxes.size());
		for(int i=0;i<chkboxes.size();i++)
		{
			if(i==1 || i==2)
			{
				chkboxes.get(i).click();
				System.out.println("Clicked:"+chkboxes.get(i).getText());
			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
