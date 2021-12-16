package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.AddressUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddressUser implements Task {
    private String strCity;
    private String strCodePostal;
    private String strCountry;

    public AddressUser(String strCity, String strCodePostal, String strCountry) {
        this.strCity        = strCity;
        this.strCodePostal  = strCodePostal;
        this.strCountry     = strCountry;
    }

    public static AddressUser onThePage(String strCity, String strCodePostal, String strCountry) {
        return Tasks.instrumented(AddressUser.class, strCity, strCodePostal, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(strCity).into(AddressUserPage.INPUT_CITY),
                WaitUntil.the(AddressUserPage.INPUT_CODEPOSTAL, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(strCodePostal).into(AddressUserPage.INPUT_CODEPOSTAL),
                WaitUntil.the(AddressUserPage.INPUT_COUNTRY, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(AddressUserPage.INPUT_COUNTRY),
                WaitUntil.the(AddressUserPage.INPUT_COUNTRY2, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(strCountry).into(AddressUserPage.INPUT_COUNTRY2),
                WaitUntil.the(AddressUserPage.DEVICES_BUTTON, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Click.on(AddressUserPage.DEVICES_BUTTON)

    );

    }
}
