package tests;

import core.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ArticleManagementPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(applicationManager.driver).getHomePage();

    }
    @Test(testName = "Login existing user with positive data")
    public void loginPositiveTest() {
        new LoginPage(applicationManager.driver)
                .enterPersonalData("admin", "Qwerty123!")
                .clickOnLoginButton();
    }
}

