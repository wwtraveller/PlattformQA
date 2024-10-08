package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KnowledgeBasePage;

public class FAQTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(applicationManager.driver).getFAQ();

    }
    @Test
    public void FAQ() {
        new HomePage(applicationManager.driver)
                .selectFAQ();
    }
}
