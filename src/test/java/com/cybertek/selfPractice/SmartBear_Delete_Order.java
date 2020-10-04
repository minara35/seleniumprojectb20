package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.SmartBearUtilities;
import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_Delete_Order {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
      // driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        BrowserUtils.wait(5);

        SmartBearUtilities.loginToSmartBear(driver);
    }
    //TC #9: SmartBear delete order
    //1. Open browser and login to SmartBear
    //2. Delete “Mark Smith” from the list
    //3. Assert it is deleted from the list

    @Test
    public void task9_delete_order() {


        WebElement name = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[3]//td[1]"));
        name.click();
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        BrowserUtils.wait(3);

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@class='SampleTable']//tr//td[2]"));
        for (WebElement eachName : allNames) {
            System.out.println("eachName = " + eachName.getText());

        }

        BrowserUtils.wait(3);
        Assert.assertTrue(!allNames.equals("Mark Smith"));

    }

    @Test
    public void task10_edit_order() {
        //TC #10: SmartBear edit order
        //1. Open browser and login to SmartBear
        //2. Click to edit button from the right for “Steve Johns”
        //3. Change name to “Michael Jordan”
        //4. Click Update
        //5. Assert “Michael Jordan” is in the list


        WebElement editButton = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[4]//td[13]"));
        editButton.click();
        BrowserUtils.wait(3);
        WebElement changeName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        changeName.clear();
        changeName.sendKeys("Michael Jordan");
        BrowserUtils.wait(3);
        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        updateButton.click();

        BrowserUtils.wait(3);
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@class='SampleTable']//tr//td[2]"));
        for (WebElement eachName : allNames) {
            System.out.println("eachName = " + eachName.getText());

        }

        BrowserUtils.wait(3);

        Assert.assertTrue(allNames.contains("Michael Jordan"));



    }

    }

