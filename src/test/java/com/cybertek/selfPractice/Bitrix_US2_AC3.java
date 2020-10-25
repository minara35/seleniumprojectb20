package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix_US2_AC3 {
     /*
    *AC1-*User should be able to click on "High Priority"
    *  checkbox to set the current task to a top priority task.
    Given Task Tab under Active Stream
     When  click on "High Priority" checkbox to set the current task to a top priority task
     Then "High Priority"  checkbox is enabled
     */

    WebDriver driver;
    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://login2.nextbasecrm.com/stream/");

    }

    @Test
    public void logIn() {

        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk15@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();

        WebElement task=driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        task.click();

        WebElement highPriority=driver.findElement(By.xpath("//input[@id='tasks-task-priority-cb']"));

        Assert.assertTrue(!highPriority.isSelected(),"Box is selected. Verification failed!");

        highPriority.click();

        WebElement isEnabled= driver.findElement(By.xpath("//input[@id='tasks-task-priority-cb']"));

        Assert.assertTrue(isEnabled.isEnabled(),"High priority box is not enabled.Verification FAILED!");

    }
}

