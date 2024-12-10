package com.orangehrm.tasks;

import com.orangehrm.models.DataModelsCandidate;
import com.orangehrm.models.DataModelsLogin;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.checkerframework.checker.units.qual.C;

import java.util.List;
import java.util.Map;

import static com.orangehrm.userInterfaces.LoginUI.INPUT_USERNAME;
import static com.orangehrm.userInterfaces.RecruitmentUI.*;

public class RecruitmentTask implements Task {

    DataTable data;
    public RecruitmentTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> a = data.asMaps(String.class, String.class);
        DataModelsCandidate dataModelsCandidate = new DataModelsCandidate(a.get(0).get("firstName"),a.get(0).get("lastName"), a.get(0).get("email"), a.get(0).get("contactNumber"));

        actor.attemptsTo(
                Click.on(RECRUITMENT_LINK),
                Click.on(BUTTON_ADD),
                Click.on(INPUT_FIRSTNAME),
                Enter.theValue(dataModelsCandidate.getFirstName()).into(INPUT_FIRSTNAME),
                Click.on(INPUT_LASTNAME),
                Enter.theValue(dataModelsCandidate.getLastName()).into(INPUT_LASTNAME),
                Click.on(INPUT_EMAIL),
                Enter.theValue(dataModelsCandidate.getEmail()).into(INPUT_EMAIL),
                Click.on(INPUT_CONTACT_NUMBER),
                Enter.theValue(dataModelsCandidate.getContactNumber()).into(INPUT_CONTACT_NUMBER),
                Click.on(BUTTON_SAVE)

        );
    }

    public static RecruitmentTask select(DataTable data){
        return Tasks.instrumented(RecruitmentTask.class,data);
    }
}
