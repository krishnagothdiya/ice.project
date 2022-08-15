package uk.ac.cam.ice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.ac.cam.ice.utility.Utility;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creating of log manager

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }//call page factory class//consturctor//interface

    @CacheLookup
    @FindBy(xpath = "//label[@id='iceForm:well:titleWrapper:title_label']")
    WebElement Title;
    @CacheLookup
    @FindBy(xpath = "//li[@id='iceForm:well:titleWrapper:title_2']")
    WebElement SelectTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='iceForm:well:forenameWrapper:forename']")
    WebElement FirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='iceForm:well:surnameWrapper:surname']")
    WebElement Surname;

    @CacheLookup
    @FindBy(linkText = "Day")
    WebElement DOBDay;
    @CacheLookup
    @FindBy(linkText = "Month")
    WebElement DOBMonth;
    @CacheLookup
    @FindBy(linkText = "Year")
    WebElement DOBYear;

    @CacheLookup
    @FindBy(id = "iceForm:well:gender:genderWrapper:gender_label")
    WebElement Gender;

    @CacheLookup
    @FindBy(id = "iceForm:well:emailAddressWrapper:emailAddress")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "iceForm:well:passwordWrapper:password")
    WebElement Password;

    @CacheLookup
    @FindBy(id = "iceForm:well:confirmPasswordWrapper:confirmPassword")
    WebElement ConfirmPassword;

    @CacheLookup
    @FindBy(className = "ui-radiobutton-box ui-widget ui-corner-all ui-state-default")
    WebElement PreviousEnquiry;

    @CacheLookup
    @FindBy(className = "ui-radiobutton-icon ui-icon ui-c ui-icon-bullet")
    WebElement Communication;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement RegisterComplete;

    public void selectTheTitle() {
        log.info("Selecting Title <br>");
        clickOnElement(Title);
        clickOnElement(SelectTitle);
    }
    public void Enterfirstname(){
        log.info("Entering FirstName <br>");
        sendTextToElement(FirstName, "Krishna");
    }
    public void EnterSurname(){
        log.info("Entering Surname <br>");
        sendTextToElement(Surname, "Gothadiya");
    }
    public void EnterDOB(){
        log.info("Entering DOB <br>");
        selectByValueFromDropDown(DOBDay, "29");
        selectByValueFromDropDown(DOBMonth, "November");
        selectByValueFromDropDown(DOBYear, "1983");
    }
    public void EnterGender(){
        log.info("Entering Gender <br>");
       selectByValueFromDropDown(Gender, "Female");
    }
    public void EnterEmail(){
        log.info("Entering Email <br>");
        sendTextToElement(Email, "krishgoth@gmail.com");
    }
    public void EnterPassword(){
        log.info("Entering Password <br>");
        sendTextToElement(Password, "@abc123");
    }
    public void ConfirmPassword(){
        log.info("Confirming Password <br>");
        sendTextToElement(ConfirmPassword, "@abc123");
    }
    public void clickonPreviousEnquiry() {
        log.info("Clicking on PreviousEnquiry Radio Button<br>");
        clickOnElement(PreviousEnquiry);
    }
    public void clickonCommunication() {
        log.info("Clicking on Communication Radio Button<br>");
        clickOnElement(Communication);
    }
//    public void clickonRegisterComplete() {
//        log.info("Clicking on RegisterComplete <br>");
//        clickOnElement(RegisterComplete);
//    }
}
