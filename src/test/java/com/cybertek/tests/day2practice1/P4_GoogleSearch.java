package com.cybertek.tests.day2practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
        //TC#4:	Google	search
        // 1-Open	a	chrome	browser
        //set up the browser driver
        WebDriverManager.chromedriver().setup();
        //create driver instance and open chrome browser
        WebDriver driver = new ChromeDriver();


        // 2-Go	to:	https://google.com
        driver.get("https://google.com");

        // 3-Write	“apple”	in	search	box
        // to be able to write anythinf in the search box
        // I need to locate the search box and use sendKeys() method to send "apple"
        // <-- finding the search bo <--- // --> sending the keys <--
        driver.findElement(By.name("q")).sendKeys("apple"  + Keys.ENTER);



        // 4-Click	google	search	button
        // 5-Verify	title:Expected:	Title	should	start	with	“apple
        // Expected : Title shoould be "apple - Google Search" we getting
        // this  info from Google search inspect on head -> title

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else {
            System.out.println("Search title verification FAILED!");
        }




    }
}
