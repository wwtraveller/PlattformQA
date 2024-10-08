package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "[placeholder='Поиск']")
    WebElement searchBox;




    public SearchPage typeInSearchFieldInput(String text) {
        driver.findElement(By.className("search_search_input_wrapper__fCtc5")).click();
        type(searchBox, text);
        return this;
    }


    public SearchPage verifyText(String text) {
        pause(1000);
        System.out.println(searchBox.getAttribute("value"));
        assert searchBox.getText().contains(text);
        return this;
    }
}
