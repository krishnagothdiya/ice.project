package uk.ac.cam.ice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.ac.cam.ice.utility.Utility;

public class CoursesPage extends Utility {  //Inheritance opps concept by extending Utility

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creating of log manager

    public CoursesPage() {
        PageFactory.initElements(driver, this);
    }//call page factory class//consturctor//interface

    @CacheLookup  //to store element in memory to run tests quicker
    @FindBy(xpath = "//input[@id='edit-freetext']")
    WebElement searchwindow; //object name

    @CacheLookup
    @FindBy(id = "edit-submit")
    WebElement search;

    @CacheLookup
    @FindBy(className = "campl-scale-with-grid")
    WebElement selectImuunology;

    @FindBy(linkText = "APPLY NOW")
    WebElement applyNow;

    @CacheLookup
    @FindBy(id = "iceForm:register")
    WebElement register;

    public void clickonsearch() { //method creation - this method click on search
        log.info("Clicking on search <br>");
        sendTextToElement(searchwindow,"Immunology");
        clickOnElement(search);
    }
    public void clickonImuunologyCourse() {
        log.info("Clicking on selectImuunology <br>");
        clickOnElement(selectImuunology);
    }
    public void clickonapplyNow() {
        log.info("Clicking on applyNow <br>");
        clickOnElement(applyNow);
    }
    public void clickonregister() {
        log.info("Clicking on register <br>");
        clickOnElement(register);
    }

}
