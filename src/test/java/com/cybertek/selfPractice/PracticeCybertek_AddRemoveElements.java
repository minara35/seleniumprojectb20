package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PracticeCybertek_AddRemoveElements {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        //3. Click to “Add Element” button 50 times
        for(int i =0; i<50; i++){
        WebElement clickAddElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        clickAddElement.click();

        }
        //4. Verify 50 “Delete” button is displayed after clicking.

       List<WebElement> buttonDelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));


        for(WebElement each :buttonDelete ){
            if(each.isDisplayed()){

                System.out.println("true");
                System.out.println(buttonDelete.size());
                each.click();

            }else {
                System.out.println("false");
            }

        }




        //5. Click to ALL “Delete” buttons to delete them.


        //6. Verify “Delete” button is NOT displayed after clicking.

        if(buttonDelete.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //Hint: Need to use findElements method.




    }
}
