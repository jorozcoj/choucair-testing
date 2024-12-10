package com.orangehrm.tasks;

import com.orangehrm.utils.UrlPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class Opens extends PageObject implements Task {
    private final UrlPage urlPage;

    public Opens(UrlPage urlPage) {
        this.urlPage = urlPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver facade = ThucydidesWebDriverSupport.getProxiedDriver();
        facade.manage().window().maximize();
        actor.attemptsTo(
                Open.url(urlPage.url())
        );
    }
    public static Opens Browser(UrlPage urlPage) {
        return Tasks.instrumented(Opens.class,urlPage);
    }
}
