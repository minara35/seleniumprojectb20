package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bitrix {
    WebDriver driver;

    @BeforeMethod
    public void Set() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/stream/");
        BrowserUtils.wait(4);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk15@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser" + Keys.ENTER);
        BrowserUtils.wait(4);

// message module
        driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).click();
        BrowserUtils.wait(4);
    }


    @Test
    public void practice2() {


        WebDriverWait wait = new WebDriverWait(driver, 10);


//Now find the element Record video
        WebElement recordingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")));
        recordingButton.click();
        BrowserUtils.wait(2);

        driver.switchTo().parentFrame();

// click allow button
       driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-blue']")).click();
        BrowserUtils.wait(2);

        //close the video window

        driver.findElement(By.xpath("//div[@class ='bx-videomessage-video-close']")).click();

        //Alert alert = driver.switchTo().alert(); not works
        //alert.accept();

        try {

            // Check the presence of alert
            Alert alert = driver.switchTo().alert();

            // if present consume the alert
            alert.accept();

        } catch (NoAlertPresentException ex) {
            //code to do if not exist.
        }




    }



    }




