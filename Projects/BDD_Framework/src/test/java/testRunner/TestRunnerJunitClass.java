package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\features\\login.feature",
				 glue="stepDefinition",
				 dryRun=false,
				 monochrome=true,
				 plugin={"pretty","html:target/cucumberReports/HTML",
						 "json:target/cucumberReports/json",
						 "junit:target/cucumberReports/xmlReport.xml"
						},
				 tags={"not @Sanity"}
				)
public class TestRunnerJunitClass {
}
