package com.cybertek.tests.day2practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {
    public static void main(String[] args) {
        //TC #5: EtsyTitle Verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        // 2.Go to https://www.etsy.com


        // 3.Search for “wooden spoon”
       // driver.findElement(By.name("search_query")).sendKeys("wooden spoon"  + Keys.ENTER);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        // 4.Verify title: Expected: “Wooden spoon | Etsy"

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else {
            System.out.println("Search title verification FAILED!");
        }



    }
}
