package webdriver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String args[]) throws InterruptedException {
		//Launch Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Launch WebApplication
		driver.get("https://www.google.com/");
		
		//Wait Statement
		Thread.sleep(5000);
		
		//Get Title of Current Page
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		//Different Behavior of "+"
		String a=10+"Saswat";
		String b="Saswat"+"Kumar";
		String c="Saswat"+12.8;
		String d="Saswat"+'K';
		
		int x=12+10;
		float y=10+12.8f;
		int z='S'+'K';
		
		//int p=10+true; error
		
		System.out.println("\n"+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
