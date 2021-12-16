package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.DevicesUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


public class DevicesUser implements Task {
    private String strComputer;
    private String strVersion;
    private String strPcLanguage;
    private String strMovil;
    private String strMovilModel;
    private String strMovilModelSO;

    public DevicesUser (String strComputer, String strVersion, String strPcLanguage, String strMovil, String strMovilModel, String strMovilModelSO) {
        this.strComputer      = strComputer;
        this.strVersion       = strVersion;
        this.strPcLanguage    = strPcLanguage;
        this.strMovil         = strMovil;
        this.strMovilModel    = strMovilModel;
        this.strMovilModelSO  = strMovilModelSO;
    }

    public static DevicesUser onThePage(String strComputer, String strVersion, String strPcLanguage, String strMovil, String strMovilModel, String strMovilModelSO) {
        return Tasks.instrumented(DevicesUser.class, strComputer, strVersion, strPcLanguage, strMovil, strMovilModel, strMovilModelSO);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DevicesUserPage.INPUT_COMPUTER, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Click.on(DevicesUserPage.INPUT_COMPUTER),
                WaitUntil.the(DevicesUserPage.INPUT_COMPUTER2, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(strComputer).into(DevicesUserPage.INPUT_COMPUTER2),

                Click.on(DevicesUserPage.INPUT_VERSION),
                WaitUntil.the(DevicesUserPage.INPUT_VERSION2, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(strVersion).into(DevicesUserPage.INPUT_VERSION2),

                Click.on(DevicesUserPage.INPUT_LANGUAGE),
                WaitUntil.the(DevicesUserPage.INPUT_LANGUAGE2, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(strPcLanguage).into(DevicesUserPage.INPUT_LANGUAGE2).thenHit(Keys.ENTER),

                Click.on(DevicesUserPage.INPUT_MOBIL),
                WaitUntil.the(DevicesUserPage.INPUT_MOBIL2, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(strMovil).into(DevicesUserPage.INPUT_MOBIL2).thenHit(Keys.ENTER),

                WaitUntil.the(DevicesUserPage.INPUT_MODEL, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(DevicesUserPage.INPUT_MODEL),
                WaitUntil.the(DevicesUserPage.INPUT_MODEL2, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(strMovilModel).into(DevicesUserPage.INPUT_MODEL2).thenHit(Keys.ENTER),

                WaitUntil.the(DevicesUserPage.INPUT_SO, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(DevicesUserPage.INPUT_SO),
                WaitUntil.the(DevicesUserPage.INPUT_SO2, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(strMovilModelSO).into(DevicesUserPage.INPUT_SO2).thenHit(Keys.ENTER),

                WaitUntil.the(DevicesUserPage.BUTTON_LASTSTEP, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Click.on(DevicesUserPage.BUTTON_LASTSTEP)
        );
    }
}
