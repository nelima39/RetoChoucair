package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordUserPage extends PageObject {
    public static final Target INPUT_PASSWORD= Target.the("Where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where do we confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_UPDATES = Target.the("Where we authorize the update").located(By.name("newsletterOptIn"));
    public static final Target CHECK_TERMOFUSER = Target.the("Where we authorize the term Of use").located(By.name("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("Where we authorize the privacy policy").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE= Target.the("Where we authorize the privacy policy").located(By.id("laddaBtn"));

}
