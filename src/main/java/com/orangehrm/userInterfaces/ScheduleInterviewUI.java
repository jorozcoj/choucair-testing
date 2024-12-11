package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScheduleInterviewUI {

    //Button Schedule Interview (shortlisted candidate page)
    public static final Target BTN_SCHEDULE_INTERVIEW = Target.the("click schedule interview button").located(By.xpath("//div[@class='orangehrm-recruitment']/div[2]/button[2][text()=' Schedule Interview ']"));

    //Page interview title, interviewer, date(Schedule interview page)

    //interview title
    public static final Target INPUT_INTERVIEW_TITLE = Target.the("enter interview title").located(By.cssSelector(".oxd-form-row:nth-child(2) .oxd-grid-item:first-child .oxd-input-group input"));

    //Interviewer
    public static final Target INPUT_INTERVIEWER = Target.the("enter interviewer").located(By.cssSelector("input[placeholder='Type for hints...']"));

    //Options to select interviewer stored
    public static final Target SELECT_OPTION = Target.the("Select option").located(By.className("oxd-autocomplete-option"));

    //Select date. Can be copied
    public static final Target INPUT_DATE = Target.the("enter date").located(By.cssSelector("input[placeholder='yyyy-dd-mm']"));
    public static final Target TXT_NOTES = Target.the("Enter notes").located(By.className("oxd-textarea"));
    public static final Target BTN_SAVE_SCHEDULE = Target.the("click save schedule button").located(By.xpath("//div[@class='oxd-form-actions']/button[2][text()=' Save ']"));


}

