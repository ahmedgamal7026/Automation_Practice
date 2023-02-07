package runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue= {"steps"},
plugin= {"pretty","html:target/cucmber-html-report"})
public class Valid_Login_TestRunner extends TestBase{

	

				
}
