package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1 -set up the web driver
        WebDriverManager.chromedriver().setup();

        //create the instance of the chrome driver

        WebDriver driver = new ChromeDriver(); // opens the broser
        driver.manage().window().maximize();
        //3 - test if driver is working

        driver.get("https://www.google.com"); // we get google.com

        System.out.println("the title of the page is: " + driver.getTitle()); // getting title

        String actualTitle = driver.getTitle(); // creating a string storing
        System.out.println("Actual Title string: " + actualTitle);


        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl); //storing value
        Thread.sleep(3000); // wait for 2 seconds
        driver.navigate().back(); // this method will take the page to previous page. You just go back.
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        String pageSource = driver.getPageSource(); // inspect by right clicking
        System.out.println("pageSource = " + pageSource );

        driver.close();













    }
}
