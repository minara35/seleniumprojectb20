package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
Better if you do with both XPATH and CSS selector for practice purposes.
 */

public class PracticeCybertek_ForgotPass {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2'] "));
        button2.click();






    }
}
