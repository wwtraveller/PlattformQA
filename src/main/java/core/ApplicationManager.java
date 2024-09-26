package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {
    protected String browser;
    public WebDriver driver;
     Logger logger= LoggerFactory.getLogger(ApplicationManager.class);

     public ApplicationManager(String browser){
         this.browser=browser;
     }
     public void startTest(){
         if (browser.equalsIgnoreCase("Chrome")){
             ChromeOptions options=new ChromeOptions();
             options.addArguments("--disable-search-engine-choice-screen");
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver(options);
         }else if(browser.equalsIgnoreCase("Firefox")){
             driver=new FirefoxDriver();
         }else if(browser.equalsIgnoreCase("Safari")){
            driver=new SafariDriver();
         }else if(browser.equalsIgnoreCase("Edge")) {
             driver = new EdgeDriver();
         } else if (browser!=null&&
         !browser.equalsIgnoreCase("Chrome")&&
                 !browser.equalsIgnoreCase("Firefox")&&
                 !browser.equalsIgnoreCase("Safari")&&
                 !browser.equalsIgnoreCase("Edge")) {
             System.err.println("Browser entered is not correct");
         }

         driver.manage().window().setPosition(new Point(2500, 0));
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
         driver.get("https://platform-qxs32.ondigitalocean.app/#/dashboard");
     }

    protected void stopTest() {
        driver.quit();
    }
}



