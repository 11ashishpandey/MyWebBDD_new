package Variables;

import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ObjecRepositoryFromProperty {
    static String  filepath=  System.getProperty("user.dir")+ "/src/main/java/Variables/config.properties";
    public static Properties p;
     static By locator= null;

    public static void initilizePropertyobjectRepository()
    {
        try {
            Reader reader = new FileReader(filepath);
             p = new Properties();
            p.load(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  static By getProperty(String locatorname) {

        String locatorproperty = p.getProperty(locatorname);
        System.out.println(locatorproperty);
        String locatortype = locatorproperty.split(":")[0];
        System.out.println(locatortype);
        String locatiorvalue = locatorproperty.split(":")[1];
        System.out.println(locatiorvalue);
        switch (locatortype) {
            case ("id"): {
                locator = By.id(locatiorvalue);
                break;
            }
            case ("xpath"): {
                locator = By.xpath(locatiorvalue);
                break;
            }
            case ("cssSelector"): {
                locator = By.cssSelector(locatiorvalue);
                break;
            }
            case ("name"): {
                locator = By.name(locatiorvalue);
                break;
            }
            case ("linkText"): {
                locator = By.linkText(locatiorvalue);
                break;
            }
            case ("partialLinkText"): {
                locator = By.partialLinkText(locatiorvalue);
                break;
            }

        }
        System.out.println("This is locator "+locator);
        return locator;
    }



}
