package com.cybertek.selfPractice;

import com.cybertek.pages.LoginPage_Vytrack;
import com.cybertek.untilities.ConfigurationReader;
import com.cybertek.untilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vytrack_forgotPassword {
    LoginPage_Vytrack loginPage;

    @Test(description = "entering incorrect username")
    public void negative_login_test1(){

        String url = ConfigurationReader.getProperty("vytrackUrl");
        Driver.getDriver().get(url);

        //Lets start using PageObjectModel

        //#1- We need to create the object of the class we want to use
        loginPage = new LoginPage_Vytrack();
        //When we create the instance of this class, the constructor immediately
        //initializes our Driver and the object 'loginPage'

        //#2- Call the object to use the web elements
        // Entering incorrect username
        loginPage.usernameInput.sendKeys("user1657");

        // Enter CORRECT password
        String password = ConfigurationReader.getProperty("UserUser");
        loginPage.passwordInput.sendKeys(password);

        // Click to login button
        loginPage.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");
        //BREAK UNTIL 8.15PM CST - 9.15PM EST

    }
}
