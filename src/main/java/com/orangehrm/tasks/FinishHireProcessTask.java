package com.orangehrm.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrm.userInterfaces.FinishHireProcessUI.*;
import static com.orangehrm.userInterfaces.ScheduleInterviewUI.INPUT_INTERVIEW_TITLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FinishHireProcessTask  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INTERVIEW_PASSED, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_INTERVIEW_PASSED),

                WaitUntil.the(BTN_INTERVIEW_PASSED, isVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue("interview passed").into(INPUT_INTERVIEW_TITLE),
                Click.on(BTN_SAVE_PASSED_INTERVIEW),

                //Section Offer Job
                WaitUntil.the(BTN_OFFER_JOB, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_OFFER_JOB),
                Enter.theValue("Job offered").into(INPUT_INTERVIEW_TITLE),
                Click.on(BTN_SAVE_OFFER_JOB),

                //section Hire
                WaitUntil.the(BTN_HIRE, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_HIRE),
                WaitUntil.the(TXT_HIRE, isVisible())
                        .forNoMoreThan(10).seconds(),
                WaitUntil.the(BTN_SAVE_HIRE, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SAVE_HIRE)
        );

    }

    public static FinishHireProcessTask finish() {
        return Tasks.instrumented(FinishHireProcessTask.class);

    }
}
