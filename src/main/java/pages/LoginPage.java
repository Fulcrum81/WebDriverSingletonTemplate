package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static base.DriverContainer.*;
import static helpers.Locators.getLocator;

public class LoginPage extends PageBase {
    private static final String LOGIN = "strong.zubovich";
    private static final String PASSWORD = "ZXCvbn123!";

    private static final String TITLE = "Mail.Ru: почта, поиск в интернете, новости, игры";

    private static final By LOGIN_FIELD = getLocator("LoginPage.loginField");
    private static final By PASSWORD_FIELD = getLocator("LoginPage.passwordField");
    private static final By BK_RU_OPTION = getLocator("LoginPage.bkRuOption");
    private static final By LOGIN_BUTTON = getLocator("LoginPage.loginButton");


    public static void shouldAppear() {
        shouldAppear(TITLE);
    }

    public static void login() {
        findElement(LOGIN_FIELD).sendKeys(LOGIN);
        findElement(PASSWORD_FIELD).sendKeys(PASSWORD);
        findElement(BK_RU_OPTION).click();
        findElement(LOGIN_BUTTON).click();
    }
}
