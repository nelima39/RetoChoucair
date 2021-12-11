package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public Register( String strName, String strLastName, String strEmail, String strLanguage, String strBirthMonth, String strBirthDay, String strBirthYear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }
    public static Register onThePage(String strName, String strLastName, String strEmail, String strLanguage, String strBirthMonth, String strBirthDay, String strBirthYear) {
        return Tasks.instrumented(Register.class, strName, strLastName, strEmail, strLanguage, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.REGISTER_BUTTON),
                Enter.theValue(strName).into(RegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(RegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(RegisterPage.SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(RegisterPage.SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(RegisterPage.SELECT_BIRTHYEAR),
                Enter.theValue(strLanguage).into(RegisterPage.INPUT_LANGUAGE),
                //Thread.sleep(3.000);
                Click.on(RegisterPage.LOCATION_BUTTON)

        );
    }
}
