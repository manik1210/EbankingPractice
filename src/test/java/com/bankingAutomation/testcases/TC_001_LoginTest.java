package com.bankingAutomation.testcases;

import com.bankingAutomation.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_LoginTest extends BaseClass{
    @Test
    public void loginTest(){
        driver.get(baseUrl);
        logger.info("URL is Opened");
        LoginPage lp= new LoginPage(driver);
        lp.setUsername(userName);
        logger.info("User name is entered");
        lp.setPassword(passWord);
        logger.info("Password is entered");
        lp.clickSubmit();
        logger.info("login button is clicked");
        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("Test Passed");
        }
        else{
            Assert.assertFalse(false);
            logger.info("Test Failed");
        }

    }
}
