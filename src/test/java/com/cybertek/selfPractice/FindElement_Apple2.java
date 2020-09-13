package com.cybertek.selfPractice;

import com.cybertek.untilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElement_Apple2 {
    public static void main(String[] args) {
        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");

        //3. Click to all of the headers one by  one

        //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        List<WebElement> listOfHeaders = driver.findElements(By.xpath("//body//a"));


        //4. Print out how many links on each page with the titles of the pages

        //5. Loop through all
        int linksWithoutText = 0;
        int linksWithText = 0;

        for(WebElement eachLink : listOfHeaders){

            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }



        //6. Print out how many link is missing text TOTAL
        System.out.println("The number of links that does not have text = " + linksWithoutText);

        //7. Print out how many link has text TOTAL
        System.out.println("The number of links that HAS text = " + linksWithText);

        //8. Print out how many total link TOTAL
        System.out.println("The number of TOTAL links on this page = " + listOfHeaders.size());










    }
}
