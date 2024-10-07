package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebElement element;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="//nav[@class='adminMenu_adminMenu__zXSCU']//a[1]:nth-child(1)")
    WebElement adminMenu;


    public HomePage getAdminMenu(){
        moveToView(adminMenu);
        click(adminMenu);
        return  new HomePage(driver);
    }

    @FindBy(xpath = "//*[.='Войти']")
    WebElement login;

    public HomePage getHomePage(){
        //moveToView(login);
        pause(1000);
        click(login);
        return new HomePage(driver);
    }

}
