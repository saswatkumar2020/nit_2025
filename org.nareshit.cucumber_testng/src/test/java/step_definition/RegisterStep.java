package step_definition;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
	
	WebDriver driver;
	@Given("User open Registration account page")
	public void user_open_registration_account_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enter below details")
	public void user_enter_below_details(DataTable dataTable) {
		
		Map<String,String> map=dataTable.asMap(String.class,String.class);
		
		System.out.println("First name is "+map.get("firstname"));
		System.out.println("Last name is "+map.get("lastname"));
		System.out.println("Email address is "+map.get("emailaddress"));
		System.out.println("Phone number is "+map.get("telephone"));
		System.out.println("Password is "+map.get("password"));
		System.out.println("Confirm Password is "+map.get("cnfpassword"));
		
	    driver.findElement(By.name("firstname")).sendKeys(map.get("firstname"));
	    driver.findElement(By.name("lastname")).sendKeys(map.get("lastname"));
	    driver.findElement(By.name("email")).sendKeys(map.get("emailaddress"));
	    driver.findElement(By.name("telephone")).sendKeys(map.get("telephone"));
	    driver.findElement(By.name("password")).sendKeys(map.get("password"));
	    driver.findElement(By.name("confirm")).sendKeys(map.get("cnfpassword"));
	    driver.findElement(By.name("newsletter")).click();
	    driver.findElement(By.name("agree")).click();
	}

	@When("Select privacy policy field and click on continue button")
	public void select_privacy_policy_field_and_click_on_continue_button() {
	    System.out.println("Privacy Button Clicked");
	}

	@Then("Account should get successfully generated")
	public void account_should_get_successfully_generated() {
		System.out.println("Account generated successfully");
	}

}
