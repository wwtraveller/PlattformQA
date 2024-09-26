package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    WebElement element;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
