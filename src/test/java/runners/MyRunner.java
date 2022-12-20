package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/java/features"}, glue= { "stepDefinitions" }, monochrome = true, dryRun = false,tags = "@test123",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumberjson.json" }
)
public class MyRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
