package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep_5 {
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		
		Hooks.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid credentials {string} and {string}")
	public void user_enter_valid_credentials_and(String uname, String pword) {
		Hooks.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		Hooks.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		Hooks.driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		System.out.println(Hooks.driver.getCurrentUrl());
		Thread.sleep(3000);
	}

}
