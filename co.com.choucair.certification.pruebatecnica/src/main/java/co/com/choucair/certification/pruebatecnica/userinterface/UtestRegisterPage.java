package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {

    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("//ul[@class='nav navbar-nav']//li//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_NAME = Target.the("Where do we write the name of user")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Where do we write the name of user")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Where do we write the name of user")
            .located(By.id("email"));

    public static final Target BIRTHMONTH = Target.the("Select the month of birth")
            .located(By.xpath("//*[@id=\"birthMonth\"]//option[contains(text(),'February')]"));

    public static final Target BIRTHDAY = Target.the("Select the day of birth")
            .located(By.xpath("//*[@id=\"birthDay\"]//option[contains(text(),'22')]"));

    public static final Target BIRTHYEAR = Target.the("Select the year of birth")
            .located(By.xpath("//*[@id=\"birthYear\"]//option[contains(text(),'1994')]"));

    public static final Target INPUT_LANGUAGE = Target.the("Input the language that spoken")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    public static final Target SELECT_LANGUAGE = Target.the("Select the language that spoken")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span/div"));

    public static final Target NEXTLOCATION_BUTTON = Target.the("button that continue the registration form " +
            "with location data").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a//span"));

    public static final Target NEXTDEVICES_BUTTON = Target.the("button that continue the registration form " +
            "with data devices").located(By.xpath("//*[@id=\"regs_container\"]//span[contains(text(),'Next: Devices')]"));

    public static final Target LASTSTEP_BUTTON = Target.the("button that continue the registration form " +
            "with data devices").located(By.xpath("//div[@class=\"pull-right next-step\"]/a//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("Where do we write the name of user")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Where do we write the name of user")
            .located(By.id("confirmPassword"));

    public static final Target CLIC_CONFIRM = Target.the("Where do we write the name of user")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CLIC_CONFIRM2 = Target.the("Where do we write the name of user")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target CLIC_COMPLETEFORM = Target.the("Where do we write the name of user")
            .located(By.id("laddaBtn"));

    public static final Target HOME = Target.the("Where do we write the name of user")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));



}
