package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressUserPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("Where do we write the City").located(By.id("city" ));
    public static final Target INPUT_CODEPOSTAL = Target.the("Where do we write the postal code").located(By.id("zip" ));
    public static final Target INPUT_COUNTRY = Target.the("Where do we enable the country list").located(By.xpath("//div[@name='countryId']/div/span/span[2]"));
    public static final Target INPUT_COUNTRY2 = Target.the("Where do we selected the country").located(By.xpath("//div[@name='countryId']/input"));
    public static final Target DEVICES_BUTTON = Target.the("Button that shows us the your devices form").located(By.xpath("//form[@name='forms.userForm']/div[2]/div/a/span"));

}
