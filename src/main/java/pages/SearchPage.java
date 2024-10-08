package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= ".search_search_container__mpYBw")
    WebElement searchBox;

    public SearchPage typeInSearchFieldInput(String text) {
        type(searchBox, text);
        return this;
    }

    @FindBy(css = ".search_search_input__pG7nc")
    WebElement searchField;

    public SearchPage verifyText(String text) {
        assert searchField.getText().contains(text);
        return this;
    }
}
