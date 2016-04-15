package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static helpers.Locators.getLocator;
import static base.DriverContainer.*;

public class MailPage extends PageBase {
    private static final String TITLE = "Входящие - strong.zubovich@bk.ru - Почта Mail.Ru";

    private static final By COMPOSE_BUTTON = getLocator("MailPage.composeButton");
    private static final By INBOX_LINK = getLocator("MailPage.inboxLink");
    private static final By SENT_ITEMS_LINK = getLocator("MailPage.sentItemsLink");
    private static final By DRAFTS_LINK = getLocator("MailPage.draftsLink");
    private static final By SPAM_LINK = getLocator("MailPage.spamLink");
    private static final By TRASH_LINK = getLocator("MailPage.trashLink");
    private static final By[] MAIL_BLOCK = new By[] {
            COMPOSE_BUTTON,
            INBOX_LINK,
            SENT_ITEMS_LINK,
            DRAFTS_LINK,
            SPAM_LINK,
            TRASH_LINK
    };

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }

    public static boolean allUiElementsPresent() {
        try {
            for(By locator : MAIL_BLOCK) {
                if(!findElement(locator).isDisplayed()) {
                    return false;
                }
            }
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
