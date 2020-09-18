package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.*;

public class Vytruck2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//form[@id='login-form']"));
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("user165" + Keys.ENTER);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);
        //module Fleet
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(5000);

        //module Fleet -> submodule Vehicle
        driver.findElement(By.xpath(("//span[@class='title title-level-2']"))).click();
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


        //find ... click on it
     driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
        //driver.findElement(By.xpath("//id[@class='dropdown']")).click();
      Thread.sleep(5000);

       //driver.findElement(By.xpath("//*[@href='javascript:void(0);']")).click();
       // driver.findElement(By.xpath("//div[@class='dropdown']")).isSelected();






      //driver.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']")).click();
        //driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']")).getLocation();


        // find icon edit
        //driver.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']")).isSelected();

       // driver.findElement(By.partialLinkText("fa-pencil-square-o ")).click();
        //driver.findElement(By.xpath("//a[@title='Edit']")).click();
        //driver.findElement(By.xpath("//a[@href='/entity/update/Extend_Entity_Carreservation/item/1562']")).click();

       Thread.sleep(3000);







// find icon edit
   //   driver.findElement(By.className("Edit")).click();
//
       // Thread.sleep(3000);

      //driver.close();
      //  driver.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']")).click();
        driver.quit(); // will quit eve





    }
}
