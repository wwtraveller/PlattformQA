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
    @FindBy(css = ".header_navRight__fEmbT > .button_myButton__gKN5o")
    WebElement login;

    public HomePage getHomePage(){
        //moveToView(login);
        pause(1000);
        click(login);
        return new HomePage(driver);
    }
    @FindBy(css = ".header_navLinkContainer__HCptx:nth-child(1)")
    WebElement knowledgeBase;
    public HomePage getKnowledgeBase(){
        this.click(this.knowledgeBase);
        return new HomePage(this.driver);
    }
    @FindBy(css = ".header_navLinkContainer__HCptx:nth-child(2)")
    WebElement FAQ;
    public HomePage getFAQ(){
        this.click(this.FAQ);
        return new HomePage(this.driver);
    }
    @FindBy(css = ".header_navLinkContainer__HCptx:nth-child(3)")
    WebElement glossary;
    public HomePage getGlossary(){
        this.click(this.glossary);
        return new HomePage(this.driver);
    }
    @FindBy(css = ".header_navLinkContainer__HCptx:nth-child(4)")
    WebElement partnership;
    public HomePage getPartnership() {
        this.click(this.partnership);
        return new HomePage(this.driver);
    }
    @FindBy(css = ".header_navLinkContainer__HCptx:nth-child(5)")
    WebElement aboutUs;
    public HomePage getAboutUs() {
        click(this.aboutUs);
        return new HomePage(this.driver);
    }
    @FindBy(css = "[placeholder='Поиск']")
    WebElement search;
    public HomePage getSearch(){
        click(this.search);
        return new HomePage(this.driver);
    }
    @FindBy(xpath = "//a[@class='header_navLink__+scxG header_active__CtAsY']")
    WebElement FAQq;
    public void selectFAQ() {
        this.click(this.FAQq);
    }
@FindBy(xpath = "//a[@class='header_navLink__+scxG header_active__CtAsY']")
WebElement glossaryS;
    public void selectGlossary() {
        this.click(this.glossaryS);
    }
    @FindBy(xpath = "//a[@class='header_navLink__+scxG header_active__CtAsY']")
    WebElement aboutUsS;
    public void selectAboutUs() {
        this.click(this.aboutUsS);
    }
}
