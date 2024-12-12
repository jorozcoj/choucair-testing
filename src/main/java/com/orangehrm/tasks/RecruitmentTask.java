package com.orangehrm.tasks;

import com.orangehrm.models.DataModelsCreateCandidate;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.orangehrm.userInterfaces.RecruitmentUI.*;

public class RecruitmentTask implements Task {

    DataTable data;
    public RecruitmentTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> a = data.asMaps(String.class, String.class);
        DataModelsCreateCandidate dataModelsCandidate = new DataModelsCreateCandidate(a.get(0).get("firstName"), a.get(0).get("middleName"),
                a.get(0).get("lastName"), a.get(0).get("email"), a.get(0).get("contactNumber"), a.get(0).get("keyWords"), a.get(0).get("notesAdd"));

        actor.attemptsTo(
                Click.on(RECRUITMENT_LINK),
                Click.on(BUTTON_ADD),
                Enter.theValue(dataModelsCandidate.getFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(dataModelsCandidate.getMiddleName()).into(INPUT_MIDDLENAME),
                Enter.theValue(dataModelsCandidate.getLastName()).into(INPUT_LASTNAME),
                Click.on(ARROW_VACANCY),
                Click.on(INPUT_VACANCY),
                Enter.theValue(dataModelsCandidate.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(dataModelsCandidate.getContactNumber()).into(INPUT_CONTACT_NUMBER),
                Enter.theValue(dataModelsCandidate.getKeyWords()).into(INPUT_KEYWORDS),
                Enter.theValue(dataModelsCandidate.getNotesAdd()).into(TXT_NOTES),
                Click.on(SELECT_CHECK),
                Click.on(BUTTON_SAVE)
        );
    }

    public static RecruitmentTask select(DataTable data) {
        return Tasks.instrumented(RecruitmentTask.class, data);
    }
}
