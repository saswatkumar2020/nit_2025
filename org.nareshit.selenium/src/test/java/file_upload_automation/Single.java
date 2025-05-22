package file_upload_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		String file1="C:\\Users\\saswa\\Desktop\\Text To Be Upload 1.txt";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1);
		
		WebElement file=driver.findElement(By.xpath("//ul[@id='fileList']"));
		
		System.out.println(file.getText());
		
		if(file.getText().equals("Text To Be Upload 1.txt"))
		{
			System.out.println("File is successfully uploaded");
		}
		else
		{
			System.out.println("Upload is fail");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
