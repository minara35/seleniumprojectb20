package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P1_CybertekForgorPassword {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

    }
}
