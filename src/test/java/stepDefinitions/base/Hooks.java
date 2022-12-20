package stepDefinitions.base;


import Variables.ObjecRepositoryFromProperty;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup()
    {
       getDriver();
        //ObjectRepo.initilizedObjectProperty();
        ObjecRepositoryFromProperty.initilizePropertyobjectRepository();


    }
    @AfterStep
    public void catchExceptionImage(Scenario scenario)
    {
        if (scenario.isFailed()) {
            byte[] screeshot= ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis()); // store data in long
            String  timemilisecond= timestamp.toString();
            scenario.attach(screeshot, "image/png","attachment "+timemilisecond);}
    }
    @After
    public void teardown() {
        cleanupDriver();
    }

}
