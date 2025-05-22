package locators;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the search item:\n\t"
				+ "(Shoes, Desktops, Clothing, Software)");
		String item=s.nextLine();
		WebDriver driver;
		if(item.equalsIgnoreCase("Shoes"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/");
			driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shoes");
			driver.findElement(By.cssSelector("button.button-1[type='submit']")).submit();
			Thread.sleep(2000);
			driver.close();
		}
		else if(item.equalsIgnoreCase("desktops"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/");
			driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Desktops");
			driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();
			Thread.sleep(2000);
			driver.close();
		}
		else if(item.equalsIgnoreCase("clothing"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/");
			driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Clothing");
			driver.findElement(By.cssSelector("button.button-1[type='submit']")).submit();
			Thread.sleep(2000);
			driver.close();
		}
		else if(item.equalsIgnoreCase("Software"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.nopcommerce.com/");
			driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Software");
			driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("Enter valid search item");
		}
		
	}

}
