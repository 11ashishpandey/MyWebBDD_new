package pageobjects;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base_PO {
    WebDriverWait wait;
    WebDriver driver= Base_PO.getDrvier();

    public Base_PO() {
        //PageFactory.initElements(getDrvier(), this);

    }

    public static WebDriver getDrvier() {

        return DriverFactory.getDriver();
    }
    public void navigateTo_url(String url)
    {
        System.out.println("The value in Baase po is "+ url);
        driver.get(url);
        //driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    public void sendkeys(WebElement element, String textToType){
//        wait= new WebDriverWait(getDrvier(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(textToType);
                //elementToBeClickable(element)).sendKeys(textToType);
    }

    public void clickOnElement( WebElement ele){
    	
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }

    public void sendkeys1(By by, String textToType){
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }
    public void wait_for_alert_and_validate_text(String text) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertmessage= driver.switchTo().alert().getText();
        Assert.assertEquals(alertmessage, text);
    }

    public void validate_stringmessage(WebElement ele, String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
        Assert.assertEquals(ele.getText(),text);

    }






    



}
