package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Variables.ObjectRepo;

public class Contact_PO extends Base_PO{

    @FindBy(name = "first_name")
    WebElement firstname_textbox;
    @FindBy(name="last_name")
    WebElement lastname_textbox;
    @FindBy(name="email")
    WebElement email_textbox;
    @FindBy(name="message")
    WebElement comment_textbox;

    @FindBy(xpath = "//div[@id='form_buttons']/input[@type='submit']")
    WebElement submit_button_contactuspage;
    @FindBy(xpath = "//input[@type='reset']")
    WebElement reset_button_contactuspage;
    @FindBy(xpath = "//div[@id='contact_reply']")
    WebElement success_message_after_registration;
    
   // "//div[@id='form_buttons']/input[@type='submit']"

    public Contact_PO(){
        super();
        PageFactory.initElements(getDrvier(), this);
    }

    public void navigate_to_WebDriverUniversity_ContactsPO()
    {
        //driver. get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        String url = "https://webdriveruniversity.com/Contact-Us/contactus.html";
        System.out.println("The value in login po is "+ url);
        navigateTo_url(url);
    }

    public void setFirstname(String firstname){
        sendkeys(firstname_textbox, firstname);
    }
    public void setLastname(String lastname){
        sendkeys(lastname_textbox, lastname);
    }
    public void setEmail(String email){
        sendkeys(email_textbox, email);
    }
    public void setCommnets(String comments){
        sendkeys(comment_textbox, comments);
    }
   public void resetbutton(){
        clickOnElement(reset_button_contactuspage);

   }
   public void submitbutton(){
	   

        clickOnElement(submit_button_contactuspage);

   }


    public void validatesuccessmessage(String text) {
        validate_stringmessage(success_message_after_registration,text);
    }
}
