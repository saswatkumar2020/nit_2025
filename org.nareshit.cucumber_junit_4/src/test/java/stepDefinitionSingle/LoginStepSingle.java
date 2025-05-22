package stepDefinitionSingle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepSingle {
	
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid credentials\\(username: {string},password: {string})")
	public void user_enter_valid_credentials_username_password(String uname, String pword) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
	}

}
