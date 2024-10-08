package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticleManagementPage extends BasePage {
    public ArticleManagementPage(WebDriver driver) {
        super(driver);
    }
 @FindBy(xpath = "//a[@class='header_navLink__+scxG header_active__CtAsY']")
 WebElement ArticleManagement;
    public void clickOnArticleManagementButton() {
        click(ArticleManagement);
    }

}
