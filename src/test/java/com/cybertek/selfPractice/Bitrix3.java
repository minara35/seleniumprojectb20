package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix3 {
    WebDriver driver;
    @BeforeMethod
    public void Set() {
        driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk15@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser" + Keys.ENTER);
        BrowserUtils.wait(2);
       driver.findElement(By.xpath("(//span[@class='feed-add-post-form-link feed-add-post-form-link-active'])")).click();
        BrowserUtils.wait(2);


    }

    //User should be able to create a quote by clicking on the Comma icon.
    @Test
    public void quoteMethod(){

       // WebElement q = driver.findElement(By.xpath("//span[@title='Quote text']"));
    //  q.click();

//BrowserUtils.wait(4);

       // WebElement t= driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
       // t.sendKeys("a");



        WebDriverWait wait = new WebDriverWait(driver, 3);
        //WebElement quote = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[4]"))));

        WebElement quote = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(" //span[@title='Quote text']"))));

       quote.click();

    quote.sendKeys("hello");


     //  Actions action = new Actions(driver);

      //action.moveToElement(quote);


       // BrowserUtils.wait(2);



      //  quote.sendKeys("q");

       //JavascriptExecutor javascript = (JavascriptExecutor) driver;
     //  javascript.executeScript("var quote = document.querySelector('//div[@class='feed-add-post-form-but-wrap']/span[4]'); quote.value = 'whatever';");



        //driver.findElement(By.xpath("//span[@title='Quote text']")).click();
        //BrowserUtils.wait(2);



//Find frame or iframe and switch
        //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("bx-editor-iframe"));

//Now find the element Record video
        //  WebElement warningAlertButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")));
        // warningAlertButton.click();
////span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']





        //WebElement quote  = driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));



        //((JavascriptExecutor)getDriver()).executeScript("$('#"+"//blockquote[@class='bxhtmled-quote']"+"').val('"+"hello"+"');");
        //span[@class='bx-b-quote-task-form-lifefeed_task_form']

        //div[@class='feed-add-post-form-but-wrap']/span[4]

   // WebElement q = driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));

     //   WebElement q = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("blockquote[class='bxhtmled-quote']")));


      // q.click();

       // q.sendKeys(Keys.BACK_SPACE);
//        q.sendKeys(Keys.DELETE);
//      q.sendKeys(Keys.CONTROL + "a");
//       q.sendKeys(Keys.BACK_SPACE);
//        q.click();

        //String one = "hello";
       // q.sendKeys("\"" + one + "\"");


       //WebElement l= driver.findElement(By.cssSelector("blockquote[class='bxhtmled-quote']"));
      // l.click();




        // q.sendKeys("hi");



        //element1.sendKeys("Hi");
        //element1.submit();








     //driver.findElement(By.xpath("//button[@id='lhe_button_submit_blogPostForm']")).click();


      //  driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-primary']")).click();


    }

}
