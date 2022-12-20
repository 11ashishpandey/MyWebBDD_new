package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {


    private static ThreadLocal<WebDriver> webdriver= new ThreadLocal<>();

    public static  WebDriver getDriver()
    {
        if (webdriver.get()==null) {
            webdriver.set(createDriver());
        }
        return webdriver.get();
    }

    private static WebDriver createDriver()
    {
        WebDriver driver = null;

        String browsertype= getbrowserType();

        switch (browsertype){
            case "chrome":
            {
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/driver/drivers/chromedriver.exe");
            ChromeOptions chromeoption = new ChromeOptions();
            chromeoption.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeoption);
            break;
            }
            case "edge":
            {
                System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/src/main/java/driver/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            }

        }
        driver.manage().window().maximize();
        return driver;

    }

    public static void cleanupDriver()
    {
        webdriver.get().quit();
        webdriver.remove();
    }

    private static String getbrowserType()  {
        String browsertype= null;
        try
        {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/Variables/config.properties");
            p.load(fis);
            browsertype = p.getProperty("browser").toLowerCase().trim();
            System.out.println("The browser is " +browsertype);

        }
        catch ( IOException e)
        {
            System.out.println(e.getMessage());
        }

        return browsertype;
    }

    public static String getvaluefromProperty()
    {
        String valueofproperty= null;
        try
        {
            Properties p = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/Variables/config.properties");
            p.load(fis);
            valueofproperty= p.getProperty("loginpageurl").toLowerCase().trim();
            System.out.println("The value of  is " +valueofproperty);

        }
        catch ( IOException e)
        {
            System.out.println(e.getMessage());
        }
        return  valueofproperty;
    }



}
