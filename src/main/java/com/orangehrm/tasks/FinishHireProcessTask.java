package com.orangehrm.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrm.userInterfaces.FinishHireProcessUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FinishHireProcessTask  implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INTERVIEW_PASSED, isVisible())
                .forNoMoreThan(10).seconds(),
                Click.on(BTN_INTERVIEW_PASSED),
                WaitUntil.the(TXT_INTERVIEWPASSED_NOTES, isVisible())
                        .forNoMoreThan(10).seconds(),
                WaitUntil.the(BTN_SAVE_PASSED_INTERVIEW, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SAVE_PASSED_INTERVIEW),

                //Section Offer Job
                WaitUntil.the(BTN_OFFER_JOB, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_OFFER_JOB),
                WaitUntil.the(TXT_OFFER_JOB, isVisible())
                        .forNoMoreThan(10).seconds(),
                WaitUntil.the(BTN_SAVE_OFFER_JOB, isVisible())
                        .forNoMoreThan(10).seconds(),
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



    //Enter.thevalue("Candidato continua en el proceso").into (Llamar localizador)
    //Hacer clic en btn save
    // Hacer clic BTN Ofter Job
    //Enter.thevalue("Candidato continua en el proceso").into (Llamar localizador)
    //Hacer clic en btn save
    //Hacer clic BTN HIRE
    //Enter.thevalue("Candidato se ha contratado").into (Llamar localizador)
    // Hacer clic en btn save
    // Select boton CANDIDATES

}
