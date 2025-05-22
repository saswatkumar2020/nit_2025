package file_upload_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		String file1="C:\\Users\\saswa\\Downloads\\Text To Be Upload 1.txt";
		String file2="C:\\Users\\saswa\\Downloads\\Text To Be Upload 2.txt";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1);
		driver.findElement(By.id("filesToUpload")).sendKeys(file2);
		
		List<WebElement> files=driver.findElements(By.xpath("//ul[@id='fileList']/li"));
		
		//Verify the File Count
		if(files.size()==2)
		{
			System.out.println("No. of files uploaded:"+files.size());
			System.out.println("All Files are Uploaded");
		}
		else
		{
			System.out.println("Files are not Uploaded properly");
		}
		
		WebElement fileText1=files.get(0);
		WebElement fileText2=files.get(1);
		
		if(fileText1.getText().equals("Text To Be Upload 1.txt") && fileText2.getText().equals("Text To Be Upload 2.txt"))
		{
			System.out.println("File names are matching");
		}
		else
		{
			System.out.println("File names are not matching");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
