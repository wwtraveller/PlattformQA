package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KnowledgeBasePage extends BasePage {
    public KnowledgeBasePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".articleUser_articleTitle__NGapH")
    WebElement product;
    public KnowledgeBasePage selectOnProduct(){
        this.click(this.product);
        return new KnowledgeBasePage(this.driver);
    }
}
