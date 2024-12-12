package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContinueProcessUI {
    public static final Target BTN_SHORTLIST = Target.the("click shortlist button").located(By.xpath("//div[@class='orangehrm-recruitment']/div[2]/button[text()=' Shortlist ']"));
    public static final Target TXT_NOTES = Target.the("Enter notes").located(By.className("oxd-textarea"));

    //Button save of the page after shortlist (shortlist candidate page)
    public static final Target BTN_SAVE_SHORTLIST = Target.the("click save button").located(By.xpath("//div[@class='oxd-form-actions']/button[text()=' Save ']"));
}


