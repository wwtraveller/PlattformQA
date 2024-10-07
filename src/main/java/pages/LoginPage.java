package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//input[@name='username'])[1]")
    WebElement userName;
    @FindBy(id = "password")
   WebElement userPassword;


    public LoginPage enterPersonalData(String user, String password) {
        type(userName, user);
        type(userPassword, password);
        return this;
    }
    @FindBy(css = "//header/div[2]/div[2]/button[2]")
    WebElement loginButton;

    public LoginPage clickOnLoginButton(){
        click(loginButton);
        return new LoginPage(driver);
    }



}
