package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class GlossaryTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(applicationManager.driver).getGlossary();

    }
    @Test
    public void FAQ() {
        new HomePage(applicationManager.driver)
                .selectGlossary();
    }
}
