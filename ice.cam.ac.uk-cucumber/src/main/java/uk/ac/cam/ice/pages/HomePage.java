package uk.ac.cam.ice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.ac.cam.ice.utility.Utility;


public class HomePage extends Utility { //Inheritance opps concept by extending Utility

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creating of log manager

    public HomePage() {
        PageFactory.initElements(driver, this);
    }//call page factory class//consturctor//interface

    @CacheLookup
    @FindBy(linkText = "Courses")
    WebElement courses;

    @CacheLookup
    @FindBy(linkText = "Course search")
    WebElement CourseSearch;


    //    public void clickonCourses() {
//        log.info("Clicking on Courses <br>");
//        clickOnElement(courses);
//    }
    public void clickonCourseSearch() {
        log.info("Clicking on CourseSearch <br>");
        mouseHoverToElement(courses);
        clickOnElement(CourseSearch);
    }
}

