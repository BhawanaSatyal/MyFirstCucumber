package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccess registrationSuccess = new RegistrationSuccess();
    ComputersPage computersPage = new ComputersPage();
    Desktops desktops = new Desktops();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ProductEmailAFriendPage productEmailAFriend = new ProductEmailAFriendPage();

    @Given("user is on registration page")
   public void user_is_on_registration_page() {
        homepage.clickOnRegister();


    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.userEntersRegistrationDetails();

    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registrationPage.clickOnRegister1();

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {


    }


    @Given("user is already registered")
    public void user_is_already_registered() {
        homepage.clickOnRegister();
        registrationPage.userEntersRegistrationDetails();
        registrationPage.clickOnRegister1();
        registrationSuccess.verifyUserShouldBeRegisteredSuccessfully();
    }

    @When("user selects computers")
    public void user_selects_computers() {
       registrationSuccess.clickOnComputersMenu();
    }

    @When("user selects desktops")
    public void user_selects_desktops() {
        computersPage.checkUserIsOnComputersPage();
        computersPage.clickOnDesktopsImage();
    }

    @And("user selects build your own computer")
    public void user_selects_build_your_own_computer() {
        desktops.checkUserIsOnDesktopsPage();
        desktops.clickOnBuildYourComputerImage();
    }

    @And("user clicks on email a friend")
    public void user_clicks_on_email_a_friend() {
       buildYourComputerPage.checkUserIsOnTheBuildYourComputerPage();
       buildYourComputerPage.clickOnEmailAFriendButton();
    }

    @And("user fills up friends email")
    public void user_fills_up_friends_email() {
        productEmailAFriend.fillForm();
    }

    @When("user click on send email button")
    public void user_click_on_send_email_button() {
        productEmailAFriend.clickOnSubmit();
    }


    @Then("user should be able to see the email has been sent")
    public void user_should_be_able_to_see_the_email_has_been_sent() {
        productEmailAFriend.checkFormIsSubmitted();
    }


}