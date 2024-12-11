package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishHireProcessUI {
    //Mark interview passed
    public static final Target BTN_INTERVIEW_PASSED = Target.the("click Mark interview passed").located(By.xpath("//div[@class='orangehrm-recruitment-actions']/button[3]"));

    //Add notes for interview passed
    public static final Target TXT_INTERVIEWPASSED_NOTES = Target.the("Enter notes interview passed").located(By.className("oxd-textarea"));
    public static final Target BTN_SAVE_PASSED_INTERVIEW = Target.the("click save interview passed button").located(By.xpath("//div[@class='oxd-form-actions']/button[2][text=' Save ']"));

    //Section offer job
    //Button offer job
    public static final Target BTN_OFFER_JOB = Target.the("click button offer job").located(By.xpath("//div[@class='orangehrm-recruitment-actions']/button[3][text()=' Offer Job ']"));
    public static final Target TXT_OFFER_JOB = Target.the("Enter notes offer job").located(By.xpath("oxd-textarea"));

    //Button save offer job
    public static final Target BTN_SAVE_OFFER_JOB = Target.the("click button save").located(By.xpath("//div[@class='oxd-form-actions']/button[2][text=' Save ']"));

    //Section Hire
    //Button Hire
    public static final Target BTN_HIRE = Target.the("click hire candidate").located(By.xpath("//div[@class='orangehrm-recruitment-actions']/button[3][text()=' Hire ']"));
    public static final Target TXT_HIRE = Target.the("Enter notes candidate hired").located(By.xpath("oxd-textarea"));
    public static final Target BTN_SAVE_HIRE = Target.the("click button hired save").located(By.xpath("//div[@class='oxd-form-actions']/button[2][text()=' Save ']"));


    //Validate candidates
    //BTN_CANDI
    public static final Target LI_CANDIDATES = Target.the("click candidates list").located(By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[1]"));

    //Validation called in the then
    //public static final Target TXT_VALIDATE_STATUS = Target.the("Name status Hired").located(By.xpath("//div[text()='Hired']"));
}
