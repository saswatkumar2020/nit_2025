package webdriver_methods;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowser2 {
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Preffered Browser\n(Chrome,Edge)");
		String op=s.nextLine();
		WebDriver driver;
		if(op.equalsIgnoreCase("cHrOme")) {
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.close();
		}
		else if(op.equalsIgnoreCase("EdGe")) {
			driver=new EdgeDriver();
			driver.get("https://www.google.com/");
			driver.close();			
		}
		else {
			System.out.println("Enter correct Browser name");
		}
	}
}