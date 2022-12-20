package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobjects.Base_PO;
import pageobjects.Contact_PO;



public class Contacts_Us_steps extends Base_PO {
    private WebDriver driver = Base_PO.getDrvier();
    private Contact_PO contactPO;

   public Contacts_Us_steps(Contact_PO contactPO1){
        this.contactPO = contactPO1;
    }


   @Given("I access the webdriver university contact us page")
   public void i_access_the_webdriver_university_contact_us_page() {
      contactPO.navigate_to_WebDriverUniversity_ContactsPO();
   }

   @When("user enters the text {string} in the firstname")
   public void user_enters_the_text_in_the_firstname(String string) {
	   contactPO.setFirstname(string);
     
   }

   @When("user enters the text {string} in the lastname")
   public void user_enters_the_text_in_the_lastname(String string) {
	   contactPO.setLastname(string);
   }

   @When("user enters the text {string} in the emailaddress")
   public void user_enters_the_text_in_the_emailaddress(String string) {
	   contactPO.setEmail(string);
   }

   @When("user enters the text {string} in the comments")
   public void user_enters_the_text_in_the_comments(String string) {
	   contactPO.setCommnets(string);
   }

   @When("user clicks in the {string}")
   public void user_clicks_in_the(String identifire) {
	   contactPO.submitbutton();
      
   }

   @When("the text message displays as {string}")
   public void the_text_message_displays_as(String string) {
	   contactPO.validatesuccessmessage(string);
   }


}
