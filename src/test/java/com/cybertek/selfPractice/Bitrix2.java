package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bitrix2 {
    WebDriver driver;

    @BeforeMethod
    public void Set() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://login2.nextbasecrm.com/stream/");

        BrowserUtils.wait(4);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk15@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser" + Keys.ENTER);
        BrowserUtils.wait(4);

        //click on message module
        driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).click();
    }
/*
    @Test
    public void practice1()  {

        //click on message module
        driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).click();
        //  driver.findElement(By.xpath("//div[@class ='feed-add-post-form-but-wrap']"));
    }

 */

    @Test
    public void practice2() {
        //click on video recording (//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]
        //(//span[.='Record Video'])[1]
        //WebElement actionBtn=driver2.findElement(
        //  By.xpath("//span[contains(@class,'v-menubar-menuitem-caption') and contains(text(), 'Actions')]"));
        //actionBtn.click();

        //click on video icon
        WebDriverWait wait = new WebDriverWait(driver, 10);

//Find frame or iframe and switch
        //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("bx-editor-iframe"));

//Now find the element Record video
      //  WebElement warningAlertButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")));
       // warningAlertButton.click();
////span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Insert video']"))).click();


        BrowserUtils.wait(6);
        //locating URL
       WebElement el = driver.findElement(By.xpath("//input[@id='video_idPostFormLHE_blogPostForm-source']"));
       el.sendKeys("https://www.youtube.com/watch?v=b4qMka1WJIs");
        BrowserUtils.wait(4);

        //save  button

       driver.findElement(By.xpath("//input[@value='Save']")).click();



    }



    }




