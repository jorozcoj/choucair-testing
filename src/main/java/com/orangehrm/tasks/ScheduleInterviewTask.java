package com.orangehrm.tasks;

import com.orangehrm.models.DataModelsCreateCandidate;
import com.orangehrm.models.DataModelsScheduleInterview;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.orangehrm.userInterfaces.ScheduleInterviewUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScheduleInterviewTask implements Task {

    DataTable data;

    public ScheduleInterviewTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> a = data.asMaps(String.class, String.class);
        DataModelsScheduleInterview dataModelsScheduleInterview = new DataModelsScheduleInterview(
                a.get(0).get("interviewTitle"),
                a.get(0).get("interviewer"),
                a.get(0).get("date"),
                a.get(0).get("notesInterview")
        );

        actor.attemptsTo(
                WaitUntil.the(BTN_SCHEDULE_INTERVIEW, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_SCHEDULE_INTERVIEW),

                WaitUntil.the(INPUT_INTERVIEW_TITLE, isVisible())
                .forNoMoreThan(10).seconds(),
                Enter.theValue(dataModelsScheduleInterview.getInterviewTitle()).into(INPUT_INTERVIEW_TITLE),

                Click.on(INPUT_INTERVIEWER),
                WaitUntil.the(INPUT_INTERVIEWER, isVisible())
                .forNoMoreThan(10).seconds(),
                Enter.theValue(dataModelsScheduleInterview.getInterviewer()).into(INPUT_INTERVIEWER),
                Click.on(SELECT_OPTION),


                Enter.theValue(dataModelsScheduleInterview.getDate()).into(INPUT_DATE),
                Enter.theValue(dataModelsScheduleInterview.getNotesInterview()).into(TXT_NOTES),
                Click.on(BTN_SCHEDULE_INTERVIEW)

        );
    }

    public static ScheduleInterviewTask nextProcess(DataTable data) {
        return Tasks.instrumented(ScheduleInterviewTask.class, data);
    }
}
