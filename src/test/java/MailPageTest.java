import base.TestBase;
import org.testng.annotations.Test;
import pages.MailPage;

import static org.testng.AssertJUnit.assertTrue;

public class MailPageTest extends TestBase {

    @Test
    public void basicUiElementsTest() {
        assertTrue(MailPage.allUiElementsPresent());
    }
}
