package com.orangehrm.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrm.userInterfaces.ValidateCandidateUI. *;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCandidateTask implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_CANDIDATES, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_CANDIDATES),
                WaitUntil.the(INPUT_SEARCH_CANDIDATE, isVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue("JHOR").into(INPUT_SEARCH_CANDIDATE),
                WaitUntil.the(OPTION_NAME, isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SEARCH),
                WaitUntil.the(TXT_VALIDATE_STATUS, isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }
    public static ValidateCandidateTask validate() {
        return Tasks.instrumented(ValidateCandidateTask.class);
    }
}
