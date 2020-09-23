package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vytruck3 {
    WebDriver driver;
    @BeforeMethod
    public void Set(){
        driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();​
    }
    @Test
    public void VytruckLogin() throws InterruptedException {
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user165");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(6000);
        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleet.click();
        WebElement vehicle =(driver.findElement(By.xpath("//span[@class='title title-level-2']")));
        vehicle.click();

        Thread.sleep(3000);

        Thread.sleep(6000);

        String actualTitle = driver.getTitle();

        String expectedTitle="Car - Entities - System - Car - Entities - System";


        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }

        WebElement listedVehicle = driver.findElement(By.xpath("//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-CatalogValue']"));
        listedVehicle.click();
        Thread.sleep(3000);

        // WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']"));
      //  WebElement three = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']"));
       // three.click();
        //WebElement edit = driver.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']"));
       // edit.click();

       // Thread.sleep(3000);
      /* WebElement add=driver.findElement(By.xpath("//button[@class='btn btn-medium add-btn']"));
        add.click();
        Thread.sleep(3000);
        WebElement reserve=driver.findElement(By.xpath("//td[.='SPB0909OKS02']"));
        reserve.click();
        Thread.sleep(3000);
        WebElement selected=driver.findElement(By.xpath("//button[.='Select']"));
        selected.click();
        Thread.sleep(3000);
        WebElement plateadded=driver.findElement(By.xpath("//input[@type='radio']"));
        plateadded.click();
        Thread.sleep(3000);
        WebElement saved=driver.findElement(By.xpath("//button[@type='submit']"));


        //saved.click();

       */
       driver.quit();
    }

}
