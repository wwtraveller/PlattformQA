package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KnowledgeBasePage;

public class KnowledgeBaseTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(app.driver).getKnowledgeBase();

    }
    @Test(testName = "ClickOnProduct")
    public void clickOnProduct() {
        new KnowledgeBasePage(app.driver)
                .selectOnProduct();
    }
}
