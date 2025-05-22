package testRunner;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinition")

@ConfigurationParameter(
		key = PLUGIN_PROPERTY_NAME, 
		value = "pretty, html:target/cucumber-report1.html,"
				+ "json:target/cucumber-report2.json,"
				+ "junit:target/cucumber-report3.xml")
public class TestRunnerLogin_5 {

}
