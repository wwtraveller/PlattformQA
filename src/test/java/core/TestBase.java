package core;

import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("Browser","Chrome"));
    Logger logger= LoggerFactory.getLogger(TestBase.class);
@BeforeSuite
    public void setUpSuite(){
    logger.info("TEST SUITE STARTING");
}
@BeforeMethod
    public void init(Method method,Object[]parameters){
    logger.info("["+method.getName()+"]");
    app.startTest();
    if (parameters!=null&&parameters.length>0){
        logger.info("Test is started: [" + method.getName() + "], with data: " + Arrays.asList(parameters));
    }else {
        logger.info("Test is started: [" + method.getName() + "]");
    }
}
@AfterSuite
    public void tearDownSuite(){
    logger.info("TEST SUITE ENDED");
}
@AfterMethod
    public void tearDown(ITestResult result){
    app.stopTest();
    if (result.isSuccess()) {
        logger.info("Test result: Passed " + result.getMethod().getMethodName());
    }else{
        logger.info("Test result: Failed " + result.getMethod().getMethodName());
    }
    logger.info("finish");
    System.out.println("f");
}
}

