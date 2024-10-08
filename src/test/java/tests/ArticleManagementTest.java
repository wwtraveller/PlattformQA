package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ArticleManagementPage;
import pages.HomePage;
import pages.LoginPage;

public class ArticleManagementTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(app.driver).getHomePage();



    }
    @Test(testName = "Article Management Test")
    public void articleManagement() {
        new ArticleManagementPage(app.driver)
                .clickOnArticleManagementButton();
               // .selectCreateArticle()
                //.clickOnSaveButton();
    }
}
