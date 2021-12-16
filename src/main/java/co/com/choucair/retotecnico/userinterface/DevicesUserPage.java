package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DevicesUserPage extends PageObject {

    public static final Target INPUT_COMPUTER = Target.the("Where do we enable S.O. list").located(By.xpath("//div[@name='osId']/div/span/span[2]"));
    public static final Target INPUT_COMPUTER2 = Target.the("Where do we selected the S.O. ").located(By.xpath("//div[@name='osId']/input"));
    public static final Target INPUT_VERSION = Target.the("Where do we enable the list computer version").located(By.xpath("//div[@name='osVersionId']/div[1]/span/span[2]"));
    public static final Target INPUT_VERSION2 = Target.the("Where do we selected the computer version").located(By.xpath("//div[@name='osVersionId']/input"));
    public static final Target INPUT_LANGUAGE = Target.the("Where do we enable the version languages list").located(By.xpath("//div[@name='osLanguageId']/div/span[1]"));
    public static final Target INPUT_LANGUAGE2 = Target.the("Where do we select the language of the version").located(By.xpath("//div[@name='osLanguageId']/input"));
    public static final Target INPUT_MOBIL = Target.the("Where do we enable the Mobil list").located(By.xpath("//div[@name='handsetMakerId']/div[1]/span[1]"));
    //correcto//public static final Target INPUT_MOBIL2 = Target.the("Where do we select the Mobil").located(By.xpath("//div[@name='handsetMakerId']/ul/li/div/span/div[contains(text(), 'Realme')]"));//Ruta Fija
    public static final Target INPUT_MOBIL2 = Target.the("Where do we select the Mobil").located(By.xpath("//div[@name='handsetMakerId']/input"));
    public static final Target INPUT_MODEL = Target.the("Where do we enable the Mobil list").located(By.xpath("//div[@name='handsetModelId']/div[1]/span"));
    public static final Target INPUT_MODEL2 = Target.the("Where do we select the Mobil").located(By.xpath("//div[@name='handsetModelId']/input[1]"));
    public static final Target INPUT_SO = Target.the("Where do we enable the Mobil list").located(By.xpath("//div[@name='handsetOSId']/div[1]/span"));
    public static final Target INPUT_SO2 = Target.the("Where do we select the Mobil").located(By.xpath("//div[@name='handsetOSId']/input"));
    public static final Target BUTTON_LASTSTEP = Target.the("Button that shows us the last step").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));


}
