package com.cybertek.pages;

import com.cybertek.untilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Vytrack {
    public LoginPage_Vytrack(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(className = "alert alert-error")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
