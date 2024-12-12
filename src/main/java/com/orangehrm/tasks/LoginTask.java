package com.orangehrm.tasks;

import com.orangehrm.models.DataModelsLogin;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.orangehrm.userInterfaces.LoginUI.*;

public class LoginTask implements Task {

    DataTable data;
    public LoginTask(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> a = data.asMaps(String.class, String.class);
        DataModelsLogin dataModelsLogin = new DataModelsLogin(a.get(0).get("userName"), a.get(0).get("password"));

        actor.attemptsTo(
                Click.on(INPUT_USERNAME),
                Enter.theValue(dataModelsLogin.getUsername()).into(INPUT_USERNAME),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(dataModelsLogin.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask with(DataTable data) {
        return Tasks.instrumented(LoginTask.class, data);
    }
}
