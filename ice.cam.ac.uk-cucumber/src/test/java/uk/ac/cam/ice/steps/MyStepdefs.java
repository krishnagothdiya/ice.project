package uk.ac.cam.ice.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.ac.cam.ice.pages.CoursesPage;
import uk.ac.cam.ice.pages.HomePage;
import uk.ac.cam.ice.pages.LoginPage;
import uk.ac.cam.ice.pages.RegisterPage;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on courses tab$")
    public void iMouseHoverOnCoursesTab() {
    }

    @And("^I click on courses search$")
    public void iClickOnCoursesSearch() {
        new HomePage().clickonCourseSearch();
    }

    @Then("^I should navigate to courses page successfully$")
    public void iShouldNavigateToCoursesPageSuccessfully() {
    }

    @And("^I search course \"([^\"]*)\"$")
    public void iSearchCourse(String Immunology){
       new CoursesPage().clickonsearch();
    }

    @And("^I should search courses successfully$")
    public void iShouldSearchCoursesSuccessfully() {
    }

    @And("^I click on Undergraduate Certificate in Immunology$")
    public void iClickOnUndergraduateCertificateInImmunology() {
        new CoursesPage().clickonImuunologyCourse();
    }

    @And("^I click on apply now$")
    public void iClickOnApplyNow() {
        new CoursesPage().clickonapplyNow();
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new LoginPage().EnterEmail();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().EnterPassword();
    }

    @Then("^I click on login$")
    public void iClickOnLogin() {
        new LoginPage().clickonLogin();
    }

//    @And("^I click on register$")
//    public void iClickOnRegister() {
//        new CoursesPage().clickonregister();
//    }
//
//    @And("^I fill the register form$")
//    public void iFillTheRegisterForm() {
//        //new RegisterPage().selectTheTitle();
//        new RegisterPage().Enterfirstname();
//        new RegisterPage().EnterSurname();
//        new RegisterPage().EnterDOB();
//        new RegisterPage().EnterGender();
//        new RegisterPage().EnterEmail();
//        new RegisterPage().EnterPassword();
//        new RegisterPage().ConfirmPassword();
//        new RegisterPage().clickonPreviousEnquiry();
//        new RegisterPage().clickonCommunication();
//
//    }
//    @Then("^I click to complete Register$")
//    public void iClickToCompleteRegister() {
//        //new RegisterPage().clickonRegisterComplete();
   // }
}
