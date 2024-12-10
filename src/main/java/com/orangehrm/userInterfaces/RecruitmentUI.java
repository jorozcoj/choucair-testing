package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentUI {

    public static final Target RECRUITMENT_LINK = Target.the("Select link recruitment ").located(By.cssSelector("a[href='/web/index.php/recruitment/viewRecruitmentModule']"));
    public static final Target BUTTON_ADD = Target.the("Click button add").located(By.cssSelector(".orangehrm-header-container button[type='button']"));
    public static final Target INPUT_FIRSTNAME = Target.the("Enter name").located(By.name("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Enter lastname").located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Enter email").located(By.cssSelector(".oxd-grid-3 .oxd-grid-item:first-child .oxd-input-field-bottom-space input[placeholder='Type here']"));
    public static final Target INPUT_CONTACT_NUMBER = Target.the("Enter contact number").located(By.cssSelector(".oxd-grid-3 .oxd-grid-item:nth-child(2) .oxd-input-field-bottom-space input[placeholder='Type here']"));
    public static final Target BUTTON_SAVE = Target.the("Select button Save").located(By.cssSelector(".oxd-form-actions .orangehrm-left-space"));
    //public static final Target INPUT_VACANCY = Target.the("Enter lastname").located(By.className("oxd-select-text"));
}
