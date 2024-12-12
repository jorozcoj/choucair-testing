package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentUI {

    public static final Target RECRUITMENT_LINK = Target.the("Select link recruitment ").located(By.cssSelector("a[href='/web/index.php/recruitment/viewRecruitmentModule']"));
    public static final Target BUTTON_ADD = Target.the("Click button add").located(By.cssSelector(".orangehrm-header-container button[type='button']"));
    public static final Target INPUT_FIRSTNAME = Target.the("Enter name").located(By.name("firstName"));
    public static final Target INPUT_MIDDLENAME = Target.the("Enter lastname").located(By.name("middleName"));
    public static final Target INPUT_LASTNAME = Target.the("Enter lastname").located(By.name("lastName"));
    public static final Target ARROW_VACANCY = Target.the("Click to open List").located(By.className("oxd-select-text"));
    public static final Target INPUT_VACANCY = Target.the("Select the vacancy").located(By.cssSelector(".oxd-select-dropdown .oxd-select-option:nth-child(3)"));
    public static final Target INPUT_EMAIL = Target.the("Enter email").located(By.cssSelector(".oxd-grid-3 .oxd-grid-item:first-child .oxd-input-field-bottom-space input[placeholder='Type here']"));
    public static final Target INPUT_CONTACT_NUMBER = Target.the("Enter contact number").located(By.cssSelector(".oxd-grid-3 .oxd-grid-item:nth-child(2) .oxd-input-field-bottom-space input[placeholder='Type here']"));
    public static final Target INPUT_KEYWORDS = Target.the("Enter keywords").located(By.cssSelector("input[placeholder='Enter comma seperated words...']"));
    public static final Target TXT_NOTES = Target.the("Enter notes").located(By.className("oxd-textarea"));
    public static final Target SELECT_CHECK = Target.the("Select Checkbox").located(By.className("oxd-checkbox-input"));
    public static final Target BUTTON_SAVE = Target.the("Select button Save").located(By.cssSelector(".oxd-form-actions .orangehrm-left-space"));
}
