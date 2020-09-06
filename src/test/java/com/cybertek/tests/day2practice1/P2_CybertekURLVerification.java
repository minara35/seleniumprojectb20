package com.cybertek.tests.day2practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        //I need to set up my browser frim Webdriver
        WebDriverManager.chromedriver().setup();
        //to create instance of chrome browser from WebDriver
        WebDriver driver = new ChromeDriver();
        // this line will maximaze the newly opened browser page
        driver.manage().window().maximize();
        //2.Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");


        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED! ");

        }else {
            System.out.println("URL verification FAILED!");
        }

        //4. Verify title:
        //Expected: Practice
//       --> actual title<---   --> expected title <---
        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
       // Thread.sleep(3000);
       // driver.close();


    }
}
