package com.cybertek.tests.day2practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_ZeroBankHeaderVerification {



    public static void main(String[] args) {
        //TC #6: Zero Bankheader verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // open browser
        WebDriver driver = new ChromeDriver();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”
        //locate the header


        String expectedText="Log in to ZeroBank";
        String actualText=driver.findElement(By.tagName("h3")).getText();
        if(actualText.equals(expectedText)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }
        driver.quit();



    }
}
