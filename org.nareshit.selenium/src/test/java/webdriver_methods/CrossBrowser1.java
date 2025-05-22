package webdriver_methods;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowser1 {
	
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Preferred Browser");
		System.out.println("1. ChromeBrowser\n2. Edge Browser");
		int op=s.nextInt();
		switch(op) {
			case 1:
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.close();
				break;
			case 2:
				WebDriver driver1=new EdgeDriver();
				driver1.get("https://www.google.com/");
				driver1.close();
				break;
		}
		
	}

}
