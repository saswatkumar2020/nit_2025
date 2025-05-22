package locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement register=driver.findElement(By.partialLinkText("REGI"));
		register.click();
		WebElement fName=driver.findElement(By.name("firstName"));
		WebElement lName=driver.findElement(By.name("lastName"));
		WebElement phone=driver.findElement(By.name("phone"));
		WebElement email=driver.findElement(By.id("userName"));
		WebElement address=driver.findElement(By.name("address1"));
		WebElement city=driver.findElement(By.name("city"));
		WebElement state=driver.findElement(By.name("state"));
		WebElement pCode=driver.findElement(By.name("postalCode"));
		fName.sendKeys("Saswat");
		lName.sendKeys("Kumar");
		phone.sendKeys("8964525015");
		email.sendKeys("abc@gmail.com");
		address.sendKeys("Ameerpet,Hyderabad,Telangana");
		city.sendKeys("Hyderabad");
		state.sendKeys("Telangana");
		pCode.sendKeys("500016");
		Thread.sleep(2000);
		fName.clear();
		lName.clear();
		phone.clear();
		email.clear();
		address.clear();
		city.clear();
		state.clear();
		pCode.clear();
		Thread.sleep(2000);
		driver.close();
	}

}