package com.banistmo.www.stepDefinitions;

import com.banistmo.www.questions.UrlPdf;
import com.banistmo.www.task.GoToFreeFree;
import com.banistmo.www.util.WebDriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ProhibicionesPdfStepDefinition {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user access successfully to the (.*)$")
    public void thatUserAccessSuccessfully(String webSite) {
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(WebDriverFactory.goToWeb(webSite)));
    }

    @When("^the user go to the fee and fees section$")
    public void theUserGoToTheFeeAndFeesSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToFreeFree.onThesite()
        );
    }

    @Then("^validates that pdf is correct (.*)$")
    public void validatesThatPdfIsCorrect(String urlPdf) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                "The url is", UrlPdf.was(), equalTo(urlPdf)
        ));
    }
}
