package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class FAQTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(app.driver).getFAQ();

    }
    @Test
    public void FAQ() {
        new HomePage(app.driver)
                .selectFAQ();
    }
}
