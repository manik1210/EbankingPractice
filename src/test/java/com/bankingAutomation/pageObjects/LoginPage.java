package com.bankingAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(name="uid")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="btnLogin")
    @CacheLookup
    WebElement btnLogin;



    public void setUsername(String userName){
        txtUsername.sendKeys(userName);
    }

    public void setPassword(String passWord){
        txtPassword.sendKeys(passWord);
    }

    public void clickSubmit(){
        btnLogin.click();
    }

}
