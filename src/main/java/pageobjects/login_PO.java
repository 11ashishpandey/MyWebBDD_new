package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class login_PO extends Base_PO{

    public @FindBy(xpath = "//input[@id='text']")
    WebElement username_textfieldl;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_textbox;
    @FindBy(id = "login-button")
    private  WebElement submitbutton;


    public login_PO() {

        super();
        PageFactory.initElements(getDrvier(), this);
    }




    public void naviagte_to_login_page()
    {
       // String url = DriverFactory.getvaluefromProperty();
        String url = "https://webdriveruniversity.com/Login-Portal/index.html";
        System.out.println("The value in login po is "+ url);
        navigateTo_url(url);
    }

    public void setusername(String username){
        sendkeys(username_textfieldl, username);
    }


    public void setpassword(String string) {
        sendkeys(password_textbox, string);
    }

    public void  clickMethod()
    {
        clickOnElement(submitbutton);
    }

    public void validationmessage(String text)
    {
        wait_for_alert_and_validate_text(text);

    }


}
