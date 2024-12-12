package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateCandidateUI {

    //Validate candidates
    //BTN_CANDI
    public static final Target BTN_CANDIDATES = Target.the("click candidates list").located(By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[1]"));
    public static final Target INPUT_SEARCH_CANDIDATE = Target.the("Search name candidate").located(By.cssSelector("input[placeholder='Type for hints...']"));
    public static final Target OPTION_NAME = Target.the("Search name candidate").located(By.cssSelector(".oxd-autocomplete-option:first-child span"));
    public static final Target BTN_SEARCH = Target.the("Select button search").located(By.className("orangehrm-left-space"));

    //Validation called in the StepDefinition (then)
    public static final Target TXT_VALIDATE_STATUS = Target.the("Name status Hired").located(By.xpath("//div[text()='Hired']"));
}
