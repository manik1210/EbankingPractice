package com.bankingAutomation.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class BaseClass {
    public String baseUrl="https://demo.guru99.com/v4/";
    public String userName="mngr546524";
    public String passWord="zEjeteq";
    public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();

        logger= Logger.getLogger("ebanking");
        PropertyConfigurator.configure("Log4j.properties");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
