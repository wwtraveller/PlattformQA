package core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public WebDriver driver;
    public JavascriptExecutor js;
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this); //POM without locators
        js=(JavascriptExecutor) driver;
    }
    public void click(WebElement element){
        element.click();
    }
    public void clickWithScroll(WebElement element){
        //moveToView(element);
        click(element);
    }
    public void  clickWithJS(WebElement element, int a, int b){
        js.executeScript("window.scrollBy "+a+", "+b);
        click(element);
    }
    public void moveToView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void type(WebElement element,String text){
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void hideAds() {
        js.executeScript("");
        js.executeScript("");
    }
}
