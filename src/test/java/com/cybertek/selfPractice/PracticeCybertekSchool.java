package com.cybertek.selfPractice;

import com.cybertek.untilities.BrowserUtils;
import com.cybertek.untilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeCybertekSchool {
    //TC #16: Double Click Test
    //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    //2. Switch to iframe.
    //3. Double click on the text “Double-click me to change my text color.”
    //4. Assert: Text’s “style” attribute value contains “red”.
    @Test
    public void ts_16_doubleClick() {
        //driver
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        WebElement iframe = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);

        //3. Double click on the text “Double-click me to change my text color.”
        WebElement doubleClick = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
        actions.doubleClick(doubleClick).perform();


        //4. Assert: Text’s “style” attribute value contains “red”.

        Assert.assertTrue(doubleClick.getAttribute("style").contains("red"));

    }

    @Test
    public void ts_17_hover() {
        //TC #16: Hover Test
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");



        //2. Drag and drop the small circle to bigger circle.


        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.wait(2);
        actions.dragAndDrop(smallCircle, bigCircle).perform();


        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        Assert.assertTrue(bigCircle.getText().equalsIgnoreCase("You did great!"));

    }

    @Test
    public void ts_18_contextClick() {
        //TC #17: Context Click – HOMEWORK
        //1. Go to https://the-internet.herokuapp.com/context_menu
        //2. Right click to the box.
        //3. Alert will open.
        //4. Accept alert
        //No assertion needed for this practice.

        //1. Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        //2. Right click to the box.

        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
        actions.contextClick(box).perform();

        //3. Alert will open.
        //4. Accept alert
       Alert alert = Driver.getDriver().switchTo().alert();
       alert.accept();


    }




}
