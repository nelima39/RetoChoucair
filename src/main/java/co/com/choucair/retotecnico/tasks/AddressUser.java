package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.AddressUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;

public class AddressUser implements Task {
    private String strCity;
    private String strCodePostal;
    private String strCountry;

    public AddressUser(String strCity, String strCodePostal, String strCountry) {
        this.strCity = strCity;
        this.strCodePostal = strCodePostal;
        this.strCountry = strCountry;
    }

    public static AddressUser onThePage(String strCity, String strCodePostal, String strCountry) {
        return Tasks.instrumented(AddressUser.class, strCity, strCodePostal, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Enter.theValue(strCity).into(AddressUserPage.INPUT_CITY),
                Enter.theValue(strCodePostal).into(AddressUserPage.INPUT_CODEPOSTAL),
                Click.on(AddressUserPage.INPUT_COUNTRY),
                Click.on(AddressUserPage.COUNTRY_LIST),
                Enter.theValue(strCountry).into(AddressUserPage.INPUT_CODEPOSTAL),
                Click.on(AddressUserPage.DEVICES_BUTTON)

        );

    }
}
