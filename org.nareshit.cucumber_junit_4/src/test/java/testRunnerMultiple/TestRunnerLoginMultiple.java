package testRunnerMultiple;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\src\\test\\resources\\Features\\MultipleLogin.feature" ,
               glue= {"stepDefinitionMultiple"},
               dryRun=false,
               monochrome=true
               )
public class TestRunnerLoginMultiple {
	/*This is empty file*/
}