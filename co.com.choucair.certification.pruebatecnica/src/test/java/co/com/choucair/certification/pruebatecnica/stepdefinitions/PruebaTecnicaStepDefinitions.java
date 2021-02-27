package co.com.choucair.certification.pruebatecnica.stepdefinitions;


import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnica.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebaTecnicaStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel wants to register on the utest page$")
    public void thanDanielWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters the form data for registration$")
    public void heEntersTheFormDataForRegistration() {
        OnStage.theActorCalled("Daniel").wasAbleTo(Register.onThePage());
    }

    @Then("^he confirms that he was registered on the page$")
    public void heConfirmsThatHeWasRegisteredOnThePage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}


