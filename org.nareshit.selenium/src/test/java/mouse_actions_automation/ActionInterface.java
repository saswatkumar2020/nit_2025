package mouse_actions_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionInterface {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
		
		WebElement rc_btn=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		Action action_Interface=action.contextClick(rc_btn).build();
		action_Interface.perform();

	}

}
