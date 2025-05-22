package keyboard_action_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CTRL_Shift_A_Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
//		Actions action=new Actions(driver);
		Robot robot = new Robot();
				
		//Open New Tab
		//action.keyDown(Keys.CONTROL).sendKeys("T").keyUp(Keys.CONTROL).build().perform();	
		
		//CTRL+Shift+A 
//		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).build().perform();
		
		//Above two will not work as Selenium WebDriver cannot interact with browser-level UI or shortcuts. Selenium can only interact with the contents of the webpage (DOM).
		
		//Open New Tab
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		//CTRL+Shift+A
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		
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
		
		//TAB
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//ENTER 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//TAB
//		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
//		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//ENTER
//		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();		

	}

}
