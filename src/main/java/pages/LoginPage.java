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
    @FindBy(xpath = "(//input[@name='password'])[1]")
   WebElement userPassword;


    public LoginPage enterPersonalData(String user, String password) {
        type(userName, user);
        type(userPassword, password);
        return this;
    }
    @FindBy(css = ".buttonLogReg_loginWindowContent__OCEgs .authWindow_authSectionLog__t1yJc .button_myButton__gKN5o")
    WebElement loginButton;

    public LoginPage clickOnLoginButton(){
        pause(1000);
        click(loginButton);
        return new LoginPage(driver);
    }

}
