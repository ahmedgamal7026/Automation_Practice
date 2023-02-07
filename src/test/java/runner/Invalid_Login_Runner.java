package runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login_With_Multi_Invalid_Values.feature",
glue= {"steps"},
plugin= {"pretty","html:target/cucmber-html-report"})
public class Invalid_Login_Runner extends TestBase{

				
}
