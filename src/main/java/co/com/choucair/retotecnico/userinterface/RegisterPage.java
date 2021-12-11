package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("Button that shows us the registration form").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_NAME = Target.the("Where do we write the first name").located(By.id("firstName" ));
    public static final Target INPUT_LASTNAME = Target.the("Where do we write the last name").located(By.id("lastName" ));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the E-mail").located(By.id("email" ));
    public static final Target SELECT_BIRTHMONTH = Target.the("Where do we write the birth month").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTHDAY = Target.the("Where do we write the birth day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTHYEAR = Target.the("Where do we write the birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("Where do we write the language").located(By.className("ui-select-search"));
    public static final Target LOCATION_BUTTON = Target.the("Button that shows us the your address form").located(By.xpath("//*[@name='userForm']/div[2]/a"));

}
