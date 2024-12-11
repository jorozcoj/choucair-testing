package com.orangehrm.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrm.userInterfaces.ScheduleInterviewUI.INPUT_INTERVIEW_TITLE;

public class ValidateHiredStatus implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade status = INPUT_INTERVIEW_TITLE.resolveFor(actor);
        return status.isDisabled();
    }
    public static ValidateHiredStatus status(){
        return new ValidateHiredStatus();
    }
}
