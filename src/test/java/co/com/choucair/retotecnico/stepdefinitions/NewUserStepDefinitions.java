package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.AddressUserData;
import co.com.choucair.retotecnico.model.DevicesUserData;
import co.com.choucair.retotecnico.model.NewUserData;

import co.com.choucair.retotecnico.model.PasswordData;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class NewUserStepDefinitions {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^nelima wants to create her username on Utest.com$")
    public void nelimaWantsToFillOutTheRegistrationForm() {
        OnStage.theActorCalled("nelima").wasAbleTo(OpenUp.thePage());
    }

    @When("^nelima registers the form data - about you$")
    public void nelimaRegistersTTheFormDataAboutYourself(List<NewUserData> newUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(newUserData.get(0).getStrName(), newUserData.get(0).getStrLastName(), newUserData.get(0).getStrEmail(), newUserData.get(0).getStrLanguage(), newUserData.get(0).getStrBirthMonth(), newUserData.get(0).getStrBirthDay(), newUserData.get(0).getStrBirthYear()));
    }

    @When("^nelima registers the form data - your address$")
    public void nelimaRegistersTheFormDataYourAddress(List<AddressUserData> addressUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddressUser.onThePage(addressUserData.get(0).getStrCity(), addressUserData.get(0).getStrCodePostal(), addressUserData.get(0).getStrCountry()));
    }
    @When("^nelima registers the form data - your devices$")
    public void nelimaRegistersTheFormDataYourDevices(List<DevicesUserData> devicesUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(DevicesUser.onThePage(devicesUserData.get(0).getStrComputer(), devicesUserData.get(0).getStrVersion(), devicesUserData.get(0).getStrPcLanguage(), devicesUserData.get(0).getStrMovil(), devicesUserData.get(0).getStrMovilModel(), devicesUserData.get(0).getStrMovilModelSO()));
    }
    @When("^nelima registers the form data - Password and checks$")
    public void nelimaRegistersTheFormDataPasswordAndChecks(List<PasswordData> passwordUserData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasswordUser.onThePage(passwordUserData.get(0).getStrPassword(), passwordUserData.get(0).getStrCheckUpdate(), passwordUserData.get(0).getBooleanCheckTermOfUser(), passwordUserData.get(0).getBooleanPrivacy()));
    }

    @Then("^nelima creates her username$")
    public void nelimaCreatesHerUsername(List<PasswordData> passwordUserData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(passwordUserData.get(0).getStrMsgWelcome())));
    }
}
