package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(applicationManager.driver).getSearch();
    }

    @Test
    public void searchBookTest(){
        new SearchPage(applicationManager.driver)
                .typeInSearchFieldInput("Продукт")
                .verifyText("Продукт");
    }
}
