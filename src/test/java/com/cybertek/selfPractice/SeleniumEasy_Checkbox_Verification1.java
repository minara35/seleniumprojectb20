package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class SeleniumEasy_Checkbox_Verification1 {
    public static void main(String[] args) {
        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify “Success – Check box is checked” message is NOT displayed.

        //4. Click to checkbox under “Single Checkbox Demo” section
        //5. Verify “Success – Check box is checked” message is displayed.




    }
}
