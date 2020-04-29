package com.learn.letskodeit.cucumber.stepdefs;

import com.learn.letskodeit.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/* Created
 * by Lamee */public class SingUpStepdefs {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I click on sing Up Page$")
    public void iClickOnSingUpPage() {
        new LoginPage().setSignUp();
    }

    @And("^I  enter the below credentials$")
    public void iEnterTheBelowCredentials(DataTable dataTable) {
        List<String> credentials=dataTable.asList(String.class);
        String name=credentials.get(0);
        String email=credentials.get(1);
        String password=credentials.get(2);
        String ConfirmPassword=credentials.get(3);
        new LoginPage().setFullName(name);
        new LoginPage().setEmailAddress(email);
        new LoginPage().setPassword(password);
        new LoginPage().setConfirmPassword(ConfirmPassword);
    }

    @And("^I click on set teams button$")
    public void iClickOnSetTeamsButton() {
        new LoginPage().setClickTerms();
    }

    @Then("^I click on signUp Button$")
    public void iClickOnSignUpButton() {
        new LoginPage().setSignUpBtn();
    }
}
