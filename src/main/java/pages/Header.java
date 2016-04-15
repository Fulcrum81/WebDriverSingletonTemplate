package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static base.DriverContainer.*;

import static helpers.Locators.getLocator;

public class Header extends PageBase {

    private static final By LOGOUT_BUTTON = getLocator("Header.logoutButton");

    public static void logout() {
        findElement(LOGOUT_BUTTON).click();
    }

    public static void goToContactsPage() {
        //TODO: add click on contacts button
    }
}
