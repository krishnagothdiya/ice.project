package uk.ac.cam.ice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.ac.cam.ice.utility.Utility;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creating of log manager

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }//call page factory class//consturctor//interface

    @CacheLookup
    @FindBy(xpath = "//input[@id='iceForm:emailAddressWrapper:emailAddress']")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "iceForm:passwordWrapper:password")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[@id='iceForm:login']")
    WebElement Login;

    public void EnterEmail(){
        log.info("Entering Email <br>");
        sendTextToElement(Email, "krishgoth@gmail.com");
    }
    public void EnterPassword(){
        log.info("Entering Password <br>");
        sendTextToElement(Password, "@abc123");
    }
    public void clickonLogin() {
        log.info("Clicking on Login <br>");
        clickOnElement(Login);
    }

}
