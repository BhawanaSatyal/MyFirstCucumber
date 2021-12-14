package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccess extends Utils {
    By _computersMenu = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href='/computers']");


    public void verifyUserShouldBeRegisteredSuccessfully() {

        String expectedRegistrationSuccessMessage = "Your registration completed"; // expected result
        String actualRegistrationSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));// actual result
        Assert.assertEquals(expectedRegistrationSuccessMessage, actualRegistrationSuccessMessage);
    }

   public void clickOnComputersMenu(){
       waitForClickable(_computersMenu,10);
       clickOnElement(_computersMenu);
   }
}


