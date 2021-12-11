package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.AddressUserData;
import co.com.choucair.retotecnico.model.NewUserData;

import co.com.choucair.retotecnico.tasks.AddressUser;
import co.com.choucair.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.tasks.Register;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class NewUserStepDefinitions {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^nelima wants to fill out the registration form$")
    public void nelimaWantsToFillOutTheRegistrationForm() {
        OnStage.theActorCalled("nelima").wasAbleTo(OpenUp.thePage());
    }

    @When("^nelima enter the form data - about yourself$")
    public void nelimaEnterTheFormDataAboutYourself(List<NewUserData> newUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(newUserData.get(0).getStrName(), newUserData.get(0).getStrLastName(), newUserData.get(0).getStrEmail(), newUserData.get(0).getStrLanguage(), newUserData.get(0).getStrBirthMonth(), newUserData.get(0).getStrBirthDay(), newUserData.get(0).getStrBirthYear()));
    }

    @When("^nelima enter the form data - your address$")
    public void nelimaEnterTheFormDataYourAddress(List<AddressUserData> addressUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddressUser.onThePage(addressUserData.get(0).getStrCity(), addressUserData.get(0).getStrCodePostal(), addressUserData.get(0).getStrCountry()));
    }
    @Then("^nelima creates her username$")
    public void nelimaCreatesHerUsername() {
    }
}
