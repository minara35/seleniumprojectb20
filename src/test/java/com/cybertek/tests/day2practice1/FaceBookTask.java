package com.cybertek.tests.day2practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


       driver.findElement(By.id("email")).sendKeys("minara35@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("M061717@m");
        driver.findElement(By.name("login")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle="";
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }
        driver.quit();







    }
}
