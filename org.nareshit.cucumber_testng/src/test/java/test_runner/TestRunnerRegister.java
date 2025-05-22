package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".\\src\\test\\resources\\Features",
		glue= {"step_definition"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target\\result.html",
				"pretty", "json:target\\result1.json",
				"pretty", "html:target\\result2.xml"}
		)
public class TestRunnerRegister extends AbstractTestNGCucumberTests{
	/*This is empty file*/
}
