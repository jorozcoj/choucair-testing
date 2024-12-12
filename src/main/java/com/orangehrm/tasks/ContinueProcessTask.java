package com.orangehrm.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.orangehrm.userInterfaces.ContinueProcessUI.*;
import static com.orangehrm.userInterfaces.ContinueProcessUI.TXT_NOTES;
import static com.orangehrm.userInterfaces.ScheduleInterviewUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ContinueProcessTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_SHORTLIST, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SHORTLIST),
                WaitUntil.the(BTN_SAVE_SHORTLIST, isVisible())
                    .forNoMoreThan(10).seconds(),

                WaitUntil.the(TXT_NOTES, isVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue("information about process").into(TXT_NOTES),

                WaitUntil.the(BTN_SAVE_SHORTLIST, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SAVE_SHORTLIST)
        );
    }
    public static ContinueProcessTask candidate(){
        return Tasks.instrumented(ContinueProcessTask.class);
    }
}
