package mouse_actions_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSlider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_slider=driver.findElement(By.xpath("(//span[starts-with(@class,'ui-slider')])[1]"));
		WebElement max_slider=driver.findElement(By.xpath("(//span[starts-with(@class,'ui-slider')])[2]"));
		
		System.out.println("Location of min-slider before moving:"+min_slider.getLocation());
		System.out.println("Location of max-slider before moving:"+max_slider.getLocation());
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(min_slider, 100, 256).build().perform();
		action.dragAndDropBy(max_slider, -100, 256).build().perform();
		
		System.out.println("Location of min-slider after moving:"+min_slider.getLocation());
		System.out.println("Location of max-slider after moving:"+max_slider.getLocation());
		
	}
}
