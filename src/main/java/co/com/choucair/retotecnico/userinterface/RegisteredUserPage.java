package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisteredUserPage {
    public static final Target MSG_REGISTERED = Target.the("Registered user message").located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
