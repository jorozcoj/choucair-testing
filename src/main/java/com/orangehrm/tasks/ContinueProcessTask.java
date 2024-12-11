package com.orangehrm.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;
import java.util.Map;

import static com.orangehrm.userInterfaces.ContinueProcessUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContinueProcessTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_SHORTLIST, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SHORTLIST),
                WaitUntil.the(BTN_SAVE_SHORTLIST, isVisible())
                    .forNoMoreThan(10).seconds(),
                Click.on(TXT_NOTES),
                Enter.theValue("information about process").into(TXT_NOTES),
                WaitUntil.the(BTN_SAVE_SHORTLIST, isVisible()),
                Click.on(BTN_SAVE_SHORTLIST)

        );
    }
    public static ContinueProcessTask candidate(){
        return Tasks.instrumented(ContinueProcessTask.class);
    }
}
