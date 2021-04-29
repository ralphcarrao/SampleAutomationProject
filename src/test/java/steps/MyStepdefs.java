package steps;

import engine.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_objects.Facebook;
import page_objects.Google;

public class MyStepdefs {

    private WebDriver driver;
    private Google google;
    private Facebook facebook;

    public MyStepdefs (Driver driver, Google google, Facebook facebook){
        this.driver = driver.get();
        this.google = google;
        this.facebook = facebook;
    }
    @Given("I redirect to google page")
    public void iRedirectToGooglePage() {
        driver.get("https://www.google.com/");
    }

    @When("I enter {string}")
    public void iEnter(String searchName) {
        google.enterSearch(searchName);
//        google.clickAvatar();
        google.clickSearch();
    }

    @And("I click {string}")
    public void iClick(String arg0) {
        google.clickFacebook();
    }

    @Then("I login button should be displayed")
    public void iLoginButtonShouldBeDisplayed() {
        facebook.verifyLoginButton();
    }
}
