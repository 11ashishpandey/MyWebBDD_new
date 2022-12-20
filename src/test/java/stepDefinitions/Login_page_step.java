package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.Base_PO;
import pageobjects.login_PO;


public class Login_page_step extends Base_PO {
    public WebDriver driver = Base_PO.getDrvier();
    private login_PO loginpo;

    public Login_page_step(login_PO loginpo)
    {

        this.loginpo= loginpo;
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        loginpo.naviagte_to_login_page();
    }

    @Given("user enters the text {string} in the username")
    public void user_enters_the_text_in_the_username(String string) {
        //driver.findElement(By.xpath("//input[@id='text']")).sendKeys(string);
        //sendkeys(By.xpath("//input[@id='text']"), string);
        loginpo.setusername(string);

    }
//    @Given("user enters the text {string} in the {string}")
//    public void user_enters_the_text_in_the(String string, String string2) {
//        String s = ObjectRepo.getElementProperty(string2);
//        System.out.println("The text3 is "+s);
//
//
//    }
    @Given("user enters the text {string} in the password")
    public void user_enters_the_text_in_the_password(String string) {
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
        //sendkeys(By.xpath("//input[@id='password']"), string);
        loginpo.setpassword(string);

    }
    @Given("user clicks the {string}")
    public void user_clicks_the(String string) {

        //driver.findElement(By.id("login-button")).click();
        //clickOnElement(By.id("login-button"));
        loginpo.clickMethod();
    }
    @Then("the {string} text displays")
    public void the_text_displays(String string) {
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        Alert arlert = driver.switchTo().alert();
//        String s = arlert.getText();
//       Assert.assertEquals(s, string );
       loginpo.validationmessage(string);


    }








}
