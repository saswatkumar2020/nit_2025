package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement forgotPwd=driver.findElement(By.linkText("Forgotten password?"));
		
		username.sendKeys("saswatkumar89@gmail.com");
		password.sendKeys("s@2345");
		Thread.sleep(2000);
		forgotPwd.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		newAccount.click();
		
				
		//WebElement login=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		//login.click(); //Human Verification is coming
		
		WebElement firstName=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		WebElement surName=driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));	 													//(//input[@name='sex'])[2]
		WebElement userId=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));											//input[@name='reg_email__']
		
		WebElement passId=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		firstName.sendKeys("Saswat");
		surName.sendKeys("Kumar");
		gender.click();
		userId.sendKeys("saswatkumar2020@gmail.com");
		passId.sendKeys("Admin123");
		Thread.sleep(2000);
		driver.close();
		
	}

}
