package com.cybertek.untilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtilities {
    //Mini-Task:
//#1- Create a new class called : SmartBearUtilities
//#2- Create a static method called loginToSmartBear
//#3- This method simply logs in to SmartBear when you call it.
//#4- Accepts WebDriver type as parameter
//BREAK UNTIL: 3.10PM CST - 4.10PM EST


    public static void loginToSmartBear( WebDriver driver){
        //3. Enter username: “Tester”
        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }
}
