package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bitrix_AC6 {
    WebDriver driver;

    @BeforeTest
    public void setMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");


        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("helpdesk15@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }


    @Test
    public void clickMessage() throws InterruptedException {
        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(5);
         WebElement addMentionIcon = driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[5]"));

        addMentionIcon.click();

        BrowserUtils.wait(5);
        List<WebElement> allNames = driver.findElements(By.xpath("//span[@class='bx-finder-groupbox-content']/a"));
        for (WebElement eachName : allNames) {
          //  System.out.println("eachName = " + eachName.getText());

        eachName.isSelected();

        }
        //It select the dropDown menu with the Employee list of contacts
        WebElement destDepartmentTab = driver.findElement(By.partialLinkText("Employees and departments"));
        destDepartmentTab.click();

        BrowserUtils.wait(2);
        //It select one of the contact for this test "helpdesk25@cybertekschool.com"
        WebElement selectEmail = driver.findElement(By.xpath("(//a[@rel='U512'])[1]"));
        selectEmail.click();

        //It gets access to the iframe
        WebElement iframeMention = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        driver.switchTo().frame(iframeMention);

        //It types a message in the iframe message area
        WebElement mentionText = driver.findElement(By.xpath("//span[@class='bxhtmled-metion']"));
        mentionText.sendKeys("Ignore this message, it is a TEST");

        //It switch back to the parent Frame
        driver.switchTo().parentFrame();

        BrowserUtils.wait(2);
        //It clicks the send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();





    }
}
