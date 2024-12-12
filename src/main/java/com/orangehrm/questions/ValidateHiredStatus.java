package com.orangehrm.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrm.userInterfaces.ValidateCandidateUI.TXT_VALIDATE_STATUS;

public class ValidateHiredStatus implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade status = TXT_VALIDATE_STATUS.resolveFor(actor);
        String actualStatus = status.getText().trim();
        String expectedStatus = "Hired";
        return actualStatus.equals(expectedStatus);
    }

    public static ValidateHiredStatus status() {
        return new ValidateHiredStatus();
    }
}
