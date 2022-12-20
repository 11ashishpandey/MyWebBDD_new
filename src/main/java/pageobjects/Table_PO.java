package pageobjects;

import Variables.ObjecRepositoryFromProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Table_PO extends Base_PO{
    ObjecRepositoryFromProperty objecRepositoryFromProperty = new ObjecRepositoryFromProperty();



    WebElement firstname_heading;
    @FindBy(xpath = "//table[@id='t01']/tbody/tr/th[text()= 'Lastname']")
    WebElement Lastname_heading;
    @FindBy(xpath = "//table[@id='t01']/tbody/tr/th[text()= 'Age']")
    WebElement Age_heading;




    public Table_PO()
    {
        super();
        PageFactory.initElements(getDrvier(), this);
    }

    public void navigate_to_table_page() {
        String url ="https://webdriveruniversity.com/Data-Table/index.html#";
        navigateTo_url(url);
    }


    public void find_the_text(String text) {
        validate_stringmessage(firstname_heading, text);
    }

    public void validate_thepagination(String pagination_number) {

    }

//    public void validatefisstnameheading(String string) {
//        By locatorinpage= objecRepositoryFromProperty.getProperty(string);
//        System.out.println("tHE LOCATIOR IN PAGE IS "+locatorinpage);
//        WebElement elementHeafingFirstName= driver.findElement(locatorinpage);
//        System.out.println("tHE elementHeafingFirstName IN PAGE IS "+elementHeafingFirstName);
//        validate_stringmessage(elementHeafingFirstName, string);
//    }

    public void validatefisstnameheading(String text, String locatorname) {
        By locatorinpage= objecRepositoryFromProperty.getProperty(locatorname);
        WebElement elementHeafingName= driver.findElement(locatorinpage);
        validate_stringmessage(elementHeafingName, text);
    }
}
