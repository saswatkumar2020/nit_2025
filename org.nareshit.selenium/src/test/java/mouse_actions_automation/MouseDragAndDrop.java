package mouse_actions_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//		WebElement dragBox1=driver.findElement(By.xpath("//div[@id='box1']"));
//		WebElement dragBox2=driver.findElement(By.xpath("//div[@id='box2']"));
//		WebElement dragBox3=driver.findElement(By.xpath("//div[@id='box3']"));
//		WebElement dragBox4=driver.findElement(By.xpath("//div[@id='box4']"));
//		WebElement dragBox5=driver.findElement(By.xpath("//div[@id='box5']"));
//		WebElement dragBox6=driver.findElement(By.xpath("//div[@id='box6']"));
//		WebElement dragBox7=driver.findElement(By.xpath("//div[@id='box7']"));
//		
//		WebElement dropBox1=driver.findElement(By.xpath("//div[text()='Italy']"));
//		WebElement dropBox2=driver.findElement(By.xpath("//div[text()='Spain']"));
//		WebElement dropBox3=driver.findElement(By.xpath("//div[text()='Norway']"));
//		WebElement dropBox4=driver.findElement(By.xpath("//div[text()='Denmark']"));
//		WebElement dropBox5=driver.findElement(By.xpath("//div[text()='South Korea']"));
//		WebElement dropBox6=driver.findElement(By.xpath("//div[text()='Sweden']"));
//		WebElement dropBox7=driver.findElement(By.xpath("//div[text()='United States']"));
//		
//		Actions action =new Actions(driver);
//		action.dragAndDrop(dragBox1, dropBox3).build().perform();
//		action.dragAndDrop(dragBox2, dropBox6).build().perform();
//		action.dragAndDrop(dragBox3, dropBox7).build().perform();
//		action.dragAndDrop(dragBox4, dropBox4).build().perform();
//		action.dragAndDrop(dragBox5, dropBox5).build().perform();
//		action.dragAndDrop(dragBox6, dropBox1).build().perform();
//		action.dragAndDrop(dragBox7, dropBox2).build().perform();
//		driver.close();
		
		List<WebElement> dragBox=driver.findElements(By.xpath("//div[@id='dropContent']/div[starts-with(@id,'box')]"));
		List<WebElement> dropBox=driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		Actions action=new Actions(driver);
		System.out.println(dragBox.size());
		System.out.println(dropBox.size());
		System.out.print("\n");		//or simply write System.out.println();
		
		for(int i=0;i<dragBox.size();i++)
		{
			WebElement w1=dragBox.get(i);
			System.out.println(w1.getText());
		}
		System.out.println();
		for(int j=0;j<dropBox.size();j++)
		{
			WebElement w2=dropBox.get(j);
			System.out.println(w2.getText());
		}
		
		action.dragAndDrop(dragBox.get(0), dropBox.get(2)).build().perform();
		action.dragAndDrop(dragBox.get(1), dropBox.get(5)).build().perform();
		action.dragAndDrop(dragBox.get(2), dropBox.get(6)).build().perform();
		action.dragAndDrop(dragBox.get(3), dropBox.get(3)).build().perform();
		action.dragAndDrop(dragBox.get(4), dropBox.get(4)).build().perform();
		action.dragAndDrop(dragBox.get(5), dropBox.get(0)).build().perform();
		action.dragAndDrop(dragBox.get(6), dropBox.get(1)).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}
}
