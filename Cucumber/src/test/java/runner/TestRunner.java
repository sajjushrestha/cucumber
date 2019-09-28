package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "features",
        glue = {"stepDefinitions"},
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}

/*
 * import org.junit.runner.RunWith; import cucumber.api.CucumberOptions;
 * //import cucumber.api.junit.Cucumber;
 * 
 * 
 * //@RunWith(Cucumber.class)
 * 
 * @CucumberOptions(features =
 * {"C:\\Users\\Sajju\\eclipse-workspace\\Cucumber\\features\\hooks.feature"},
 * glue= {"stepDefinition"}, plugin=
 * {"html:target/cucumber-html-report","json:target/cucumber.json",
 * "usage:target/cucumber-usage.json"}, dryRun=false, strict=true, format=
 * {"pretty"}, monochrome=true )
 * 
 * public class TestRunner {
 * 
 * // tags = {"@e2e","@regression"}) -- means AND condition // tags =
 * {"@e2e,@regression"}) -- means OR condition // tags = {"~@e2e,@regression"})
 * -- ~ means NOT either condition
 * 
 * }
 */