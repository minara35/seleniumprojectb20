package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Vytruck {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//form[@id='login-form']"));
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("user165" + Keys.ENTER);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);

        Thread.sleep(6000);
        String actualTitle = driver.getTitle();

        String expectedTitle="Dashboard";


        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }

        Thread.sleep(6000);
        driver.quit(); // will quet eve
        // driver.close();


    }
}
