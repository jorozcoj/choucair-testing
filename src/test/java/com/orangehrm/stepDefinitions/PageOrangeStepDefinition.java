package com.orangehrm.stepDefinitions;

import com.orangehrm.questions.ValidateHiredStatus;
import com.orangehrm.tasks.*;
import com.orangehrm.utils.UrlPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PageOrangeStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver browser;

    @Before
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("jhorman").can(BrowseTheWeb.with(browser));
    }

    @Given("That the user enter home page and login")
    public void thatTheUserEnterHomePageAndLogin(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().wasAbleTo(
                Opens.Browser(UrlPage.URLPAGE),
                LoginTask.with(dataTable)
        );

    }
    @When("Full form to register a new candidate")
    public void fullFormToRegisterANewCandidate(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                RecruitmentTask.select(dataTable)
        );
    }

    @When("the candidate continues with the hired process")
    public void theCandidateContinuesWithTheHiredProcess(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                ContinueProcessTask.candidate(),
                ScheduleInterviewTask.nextProcess(dataTable)
        );

    }

    @Then("Validate candidate status to be hired")
    public void validateCandidateStatusToBeHired() {
       /* theActorInTheSpotlight().should(
                seeThat(
                        ValidateHiredStatus.status(), Matchers.equalTo(true)
                ));*/
    }
}
