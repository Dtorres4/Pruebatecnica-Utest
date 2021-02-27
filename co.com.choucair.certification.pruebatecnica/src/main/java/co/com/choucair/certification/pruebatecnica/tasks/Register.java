package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue("Daniel").into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue("Torres").into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue("daniel.torres474@gmail.com").into(UtestRegisterPage.INPUT_EMAIL),
                Click.on(UtestRegisterPage.BIRTHMONTH),
                Click.on(UtestRegisterPage.BIRTHDAY),
                Click.on(UtestRegisterPage.BIRTHYEAR),
                Click.on(UtestRegisterPage.BIRTHYEAR),
                Enter.theValue("Spanish").into(UtestRegisterPage.INPUT_LANGUAGE),
                Click.on(UtestRegisterPage.SELECT_LANGUAGE),
                Click.on(UtestRegisterPage.NEXTLOCATION_BUTTON),
                Click.on(UtestRegisterPage.NEXTDEVICES_BUTTON),
                Click.on(UtestRegisterPage.LASTSTEP_BUTTON),
                Enter.theValue("Daniel31124821*").into(UtestRegisterPage.INPUT_PASSWORD),
                Enter.theValue("Daniel31124821*").into(UtestRegisterPage.INPUT_CONFIRMPASSWORD),
                Click.on(UtestRegisterPage.CLIC_CONFIRM),
                Click.on(UtestRegisterPage.CLIC_CONFIRM2),
                Click.on(UtestRegisterPage.CLIC_COMPLETEFORM)
        );
    }
}
