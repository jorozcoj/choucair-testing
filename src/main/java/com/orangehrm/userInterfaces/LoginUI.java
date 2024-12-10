package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target INPUT_USERNAME = Target.the("Enter username").located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Click login button ").located(By.cssSelector("button[type='submit']"));
}
