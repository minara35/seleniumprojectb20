package com.cybertek.untilities;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import java.util.List;

public class SmartBearUtilities {
    //Mini-Task:
//#1- Create a new class called : SmartBearUtilities
//#2- Create a static method called loginToSmartBear
//#3- This method simply logs in to SmartBear when you call it.
//#4- Accepts WebDriver type as parameter
//BREAK UNTIL: 3.10PM CST - 4.10PM EST


    public static void loginToSmartBear( WebDriver driver){
        //3. Enter username: “Tester”
        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }
//Create a method named verifyOrder in SmartBearUtils class.
//• Method takes WebDriver object and String(name).
//• Method should verify if given name exists in orders.
//• This method should simply accepts a name(String), and assert whether
//given name is in the list or not.
//• Create a new TestNG test to test if the method is working as expected.

    public static void verifyOrder(WebDriver driver, String name) {
//created a locator that only returns the names of the customers from all of the rows
        //created a list and stored the cells that has customer name information into it
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        // if there is only one table on the page you dont have to locate the table --> //tr /td[2]
        //List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
//type "iter", press tab for for each loop short cut

        //type iter, press tab for "for each" loop short cut.

        for (WebElement each : nameList) {

            if (each.getText().equals(name)) {
                Assert.assertTrue(each.getText().equals(name));
                return;
            }
        }
        // Assert fail method will fail the test when it is called, no matter what.
        Assert.fail("Name: " + name+ " does not exist in the list! Verification FAILED!!!");
    }
//Practice #5: Method: printNamesAndCities
//• Create a method named printNamesAndCities in SmartBearUtils class.
//• Method takes WebDriver object.
//• This method should simply print all the names in the List of All Orders.
//• Create a new TestNG test to test if the method is working as expected.
//• Output should be like:
//• Name1: name , City1: city
//• Name2: name , City2: city

    public static void printNamesAndCities(WebDriver driver){
        //locating all the names from all the rows and storing in a list of web element
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));


        for(int i =0; i < nameList.size(); i++){
            System.out.println("Name"+ (i+1) +": " + nameList.get(i).getText() + ", City"+ (i+1) +": " + citiesList.get(i).getText());

        }

    }
//Create a method called removeName()
//1. Accepts two parameters: WebDriver, String name
//2. Method will remove the given name from the list of Smartbear
//3. Create a new TestNG test, and call your method.
//4. Assert that your method removed the given name


    public static void removeName(WebDriver driver, String name){
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));



        for(int i =0; i < nameList.size(); i++){
            System.out.println("Name"+ (i+1) +": " + nameList.get(i).getText());

    }
    }

}
















