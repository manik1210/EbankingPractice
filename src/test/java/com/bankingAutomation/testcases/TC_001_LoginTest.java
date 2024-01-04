package com.bankingAutomation.testcases;

import com.bankingAutomation.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_LoginTest extends BaseClass{
    @Test
    public void loginTest(){
        driver.get(baseUrl);
        LoginPage lp= new LoginPage(driver);
        lp.setUsername(userName);
        lp.setPassword(passWord);
        lp.clickSubmit();
        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertFalse(false);
        }

    }
}
