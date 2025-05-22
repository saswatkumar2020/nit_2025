package webdriver_methods;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//Launch Application //Parent Window
		driver.get("https://www.w3schools.com/");
		
		//click on Try Yourself //Child Window
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).click();
		
		//Get Window Handles values of all browser Window ids
		Set<String> windowIds=driver.getWindowHandles();		
		System.out.println("Set ids : "+windowIds);	
		
		//For-Each Loop to extract ids
		System.out.println("For-Each ids : ");
		for(String ids : windowIds) {
			System.out.println("\t"+ids);
		}
		
		//For Loop to extract ids
		System.out.println("For ids : ");
		for(int i=0;i<windowIds.size();i++) {
			System.out.println("\tNot Possible bcz Set are not indexed");
		}
		
		//Convert Set into List to extract Window ids
		List<String> myList=new ArrayList<String>(windowIds);
		System.out.println("List ids : "+myList);
		
		//Get Parent Window id
		String pid=myList.get(0);
		System.out.println("Parent id : "+pid);
		
		//Get Child Window id
		String cid=myList.get(1);
		System.out.println("Child id : "+cid);
		
		//Switch to Child Window ,get url and close it
		driver.switchTo().window(cid);
		System.out.println("Child Closed URL ->"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();	
		
		//Switch to Parent Window ,get url and close it
		driver.switchTo().window(pid);
		System.out.println("Parent Closed URL ->"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
	}
}
