package mouse_actions_automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		WebElement try_it_yourself=driver.findElement(By.xpath("//a[text()='Try it Yourself']"));
		try_it_yourself.click();
		//WebElement copy_btn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='html'])[2]")));
				//Get Window Ids and switch to parent window
				Set<String> windowIds=driver.getWindowHandles();
				List<String> myList=new ArrayList<String>(windowIds);
				System.out.println("List ids : "+myList);
				//Get Parent Window id
				String pid=myList.get(0);
				System.out.println("Parent id : "+pid);
				//Get Child Window id
				String cid=myList.get(1);
				System.out.println("Child id : "+cid);
				driver.switchTo().window(cid);
		WebElement copy_btn=driver.findElement(By.xpath("(//span[text()='html'])[2]"));
		Actions action=new Actions(driver);
		action.doubleClick(copy_btn).build().perform();
		Thread.sleep(2000);

	}

}
