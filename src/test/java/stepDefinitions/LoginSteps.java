package stepDefinitions;

import factory.DriverFactory;
import factory.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    @Given("I am on shopping site")
    public void navigateToShoppingSite() {
        DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
    }

    @When("I enter username")
    public void enterUsername() {
        PageFactory.getLoginPage().enterUsername("aastha.kaushik@abc.com");
    }

    @And("I enter password")
    public void enterPassword() {
        PageFactory.getLoginPage().enterPassword("Aastha123");
    }

    @And("I click on Sign in")
    public void clickOnSignInBtn() {
        PageFactory.getLoginPage().clickSignInBtn();
    }

    @Then("I should be on accounts page")
    public void verifyHomePage() {
        System.out.println("Home Page");
    }
}
