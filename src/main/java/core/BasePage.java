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
        PageFactory.initElements(driver,this);
        js=(JavascriptExecutor) driver;
    }
    public void click(WebElement element){
        element.click();
    }
    public void clickWithScroll(WebElement element){
        //moveToView(element);
        click(element);
    }
    public void type(WebElement element,String text){
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
}
