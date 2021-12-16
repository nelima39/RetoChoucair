package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.PasswordUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasswordUser implements Task {
    private String strPassword;
    private Boolean strCheckUpdate;
    private Boolean booleanCheckTermOfUser;
    private Boolean booleanPrivacy;

    public PasswordUser(String strPassword, Boolean strCheckUpdate, Boolean booleanCheckTermOfUser, Boolean booleanPrivacy) {
        this.strPassword            = strPassword;
        this.strCheckUpdate         = strCheckUpdate;
        this.booleanCheckTermOfUser = booleanCheckTermOfUser;
        this.booleanPrivacy         = booleanPrivacy;

    }

    public static PasswordUser onThePage(String strPassword, Boolean strCheckUpdate, Boolean booleanCheckTermOfUser, Boolean booleanPrivacy) {
        return Tasks.instrumented(PasswordUser.class, strPassword, strCheckUpdate, booleanCheckTermOfUser, booleanPrivacy);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(PasswordUserPage.INPUT_PASSWORD),
                WaitUntil.the(PasswordUserPage.INPUT_CONFIRM_PASSWORD, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(strPassword).into(PasswordUserPage.INPUT_CONFIRM_PASSWORD),
                WaitUntil.the(PasswordUserPage.CHECK_UPDATES, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Check.whether(strCheckUpdate).andIfSo(Click.on(PasswordUserPage.CHECK_UPDATES)),
                WaitUntil.the(PasswordUserPage.CHECK_TERMOFUSER, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Check.whether(booleanCheckTermOfUser).andIfSo(Click.on(PasswordUserPage.CHECK_TERMOFUSER)),
                WaitUntil.the(PasswordUserPage.CHECK_PRIVACY, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Check.whether(booleanPrivacy).andIfSo(Click.on(PasswordUserPage.CHECK_PRIVACY)),
                WaitUntil.the(PasswordUserPage.BUTTON_COMPLETE, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(PasswordUserPage.BUTTON_COMPLETE)

        );
    }
}
