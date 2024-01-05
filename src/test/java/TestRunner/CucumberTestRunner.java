
package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/Features"},
		glue = {"StepDefinitions"},
		dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/htmlreport.html"}

		)
public class CucumberTestRunner extends AbstractTestNGCucumberTests  {

	
}
