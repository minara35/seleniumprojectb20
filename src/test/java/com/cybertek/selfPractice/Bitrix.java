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
      // driver.manage().window().maximize();​
        driver.get("https://login2.nextbasecrm.com/stream/");
        BrowserUtils.wait(4);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk15@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser" + Keys.ENTER);
        BrowserUtils.wait(4);


        driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")).click();
        BrowserUtils.wait(4);
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

        WebDriverWait wait = new WebDriverWait(driver, 10);


//Find frame or iframe and switch
        //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("bx-editor-iframe"));

//Now find the element Record video
        WebElement warningAlertButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")));
        warningAlertButton.click();
        BrowserUtils.wait(4);
       driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-blue']")).click();
      // BrowserUtils.wait(6);

      // Alert alert = driver.switchTo().alert();

      // alert.accept();

      //  BrowserUtils.wait(2);


        //driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-blue']")).click();

     // driver.switchTo().alert().accept();


      // Switching to Alert
      //  Alert alert = driver.switchTo().alert();

        // Capturing alert message.


        //String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        //System.out.println(alertMessage);
      // BrowserUtils.wait(5);

        // Accepting alert
     //   alert.accept();


//Once all your stuff done with this frame need to switch back to default
        // driver.switchTo().defaultContent();


        // WebElement warningAlertButton = driver.findElement(By.xpath("(//span[contains(@class,'feed-add-post-form-but-cnt feed-add-videomessage') and contains(text(), 'Record Video')])[1]"));


        //1- Create Alert instance and switch to alert
       // driver.switchTo().alert();
       // BrowserUtils.wait(2);

        //2- Use "alert" instance to accept the javascript alert(popup)


        //Locating the result text web element
        // WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        // Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");
        BrowserUtils.wait(4);

    }



    }




