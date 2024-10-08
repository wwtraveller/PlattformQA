package tests;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;


public class AboutUsTest extends TestBase{
        @BeforeMethod
        public void precondition(){
            new HomePage(app.driver).getAboutUs();

        }
        @Test
        public void aboutUs() {
            new HomePage(app.driver)
                    .selectAboutUs();
        }
    }

